package programmer_career.Exersise_01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static programmer_career.Exersise_01.Ex1_2.isStrPerestanovka;

class Ex1_2Test {

    @Test
    public void isPerestanovkaTrue() {
        String str1 = "asdfghj";
        String str2 = "jghfdsa";
        boolean result = isStrPerestanovka(str1, str2);

        assertThat(result).isTrue();
    }

    @Test
    public void isPerestanovkaFalse() {
        String str1 = "asdfghja";
        String str2 = "afaaaghj";
        boolean result = isStrPerestanovka(str1, str2);

        assertThat(result).isFalse();
    }

    @Test
    public void isOneCharIsThrowException() {
        assertThatThrownBy(() -> isStrPerestanovka(null, null))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
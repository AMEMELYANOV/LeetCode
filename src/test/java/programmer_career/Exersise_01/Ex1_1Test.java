package programmer_career.Exersise_01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static programmer_career.Exersise_01.Ex1_1.isCharOne;

class Ex1_1Test {

    @Test
    public void isOneCharisTrue() {
        String str = "asdfghj";
        boolean result = isCharOne(str);

        assertThat(result).isTrue();
    }

    @Test
    public void isOneCharIsFalse() {
        String str = "asdfghja";
        boolean result = isCharOne(str);

        assertThat(result).isFalse();
    }

    @Test
    public void isOneCharIsThrowException() {
        assertThatThrownBy(() -> isCharOne(null))
                .isInstanceOf(IllegalArgumentException.class);
    }


}
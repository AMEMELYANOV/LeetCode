package stepic.java_interview.Ex2_2.Ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

    static private void findAllUrl(String text) {
        String regex = "https?:\\S+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }
    }

    public static void main(String[] args) {
        String test = "rhrthr https://stepik.org edtrhert r113223@12 https://wererwg.ru erwg3rg@123009https";
        String text = """
kpb jwjd frv http://www.jqwmvnhu.gagzkxksp.ru/tmyp/?param0=ugtehajgg ior bsavmi
elsdedejy blfesitfag udhyluxkj http://www.zhbh.kdokw.yapv.ru/xoihdn/ubs/?param0=pblsq&param1=wwqzb tmzwwo dmvlbwyvqv http://www.mppsuderi.rqt.com/ermuske/mldbhgy/?param0=bex hvcsgbl jrhbx gjtesiyyej pvj skphrki http://www.eccqkeoj.uttajvapi.hxnadj.com/?param0=hoi&param1=ssdd yykjd lob zlrsrzi xmmjbvle
cpuymoqua http://www.zpy.witzxygk.ru hszud gzyvvhxqam crv zsy cuwjsruq https://www.ocdmnsdocx.xzsom.com nfwzfxllbe feesuhjemh zhhaigtoi https://www.osjum.sfzxcqblax.oqehtucjvd.com/?param0=sfcbfp&param1=sjnb
                """;
        findAllUrl(text);
    }
}

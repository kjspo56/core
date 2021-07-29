package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */

    int discount(Member member, int price); //F2 단축키 : 에러나는곳을 바로 처리 할 수 있게 도와줌

}

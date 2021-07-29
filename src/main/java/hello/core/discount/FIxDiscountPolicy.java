package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FIxDiscountPolicy implements DiscountPolicy{

    private int discountFixAount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAount;
        } else {
            return 0;
        }
    }
}

package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    //인터페이스가 하나이고, 구현클래스도 딱 하나인 경우에 관례상 impl을 많이 붙임
    //할인정책 같은 경우에는 구현 클래스가 하나가 아니니깐...ㅎㅎ;;

    //유연적 할인
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}

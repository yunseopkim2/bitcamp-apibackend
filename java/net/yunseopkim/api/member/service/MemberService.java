package net.yunseopkim.api.member.service;

import net.yunseopkim.api.member.domain.MemberDTO;

/**
 * packageName: net.yunseopkim.api.member.service
 * fileName   : MemberService
 * author     : kimyunseop
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-11   yunseopkim        최초 생성
 */
public interface MemberService {

    String membershipList(MemberDTO member);
    String memberInformation(MemberDTO member);
    String shipmentList(MemberDTO member);
    String sendEmail(MemberDTO member);
    String savingMoneyList(MemberDTO member);
    String accumulatedMoney(MemberDTO member);
}

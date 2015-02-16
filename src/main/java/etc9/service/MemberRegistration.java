package etc9.service;

import etc9.model.Member;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class MemberRegistration {

    @Inject
    private EntityManager em;

    @Inject
    private Event<Member> memberEventSrc;

    public void register(Member member) throws Exception {
        em.persist(member);
        memberEventSrc.fire(member);
    }
}
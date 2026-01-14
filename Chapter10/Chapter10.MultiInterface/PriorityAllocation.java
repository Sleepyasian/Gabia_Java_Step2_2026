public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 우선순위가 높은 고객부터 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기 시간이 가장 작은 상담원에게 배분합니다.");
    }

}

package lessons_EU7.day44_oopReview.callCenter;

public class CallCenter_Test {

    public static void main(String[] args) {

        WhatsApp wa= new WhatsApp();
        wa.launch();
        wa.allOSCompatible=false;
        wa.isFree=true;
        wa.name="WhatsApp";
        wa.call("Melek");
        wa.sendMessage("thanks");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CALL);

       MessagingApp.setCount(4);
        System.out.println(wa.getCount());



    }

}

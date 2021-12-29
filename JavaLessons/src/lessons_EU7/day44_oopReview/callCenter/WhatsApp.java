package lessons_EU7.day44_oopReview.callCenter;

public class WhatsApp extends MessagingApp implements VideoCallable,VoiceCallable{
    @Override
    public void sendMessage(String msg) {
        System.out.println("sending message"+msg);
    }

    @Override
    public void videoCall() {
        System.out.println("whatsApp doing a video call..");
    }

    @Override
    public void call(String contact) {
        System.out.println("calling"+ contact);
    }
}

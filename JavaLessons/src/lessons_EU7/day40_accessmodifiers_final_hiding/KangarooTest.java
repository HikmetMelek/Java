package lessons_EU7.day40_accessmodifiers_final_hiding;

public class KangarooTest {
    public static void main(String[] args) {

        Kangaroo k= new Kangaroo();

        k.getMarsupialDescription();// boolean static olmasaydı method override olurdu, bu da sonucu etkilerdi.
        // override olsaydı sout: Marsupial walks on the two legs: true olurdu. k objesi once kangaroo class a gidiyor
        // sonra parent a gidiyor. k.getMarsupialDescription() ile önce parent daki isBiped() olusuyor sonra override ile
        // child class a gelince isBiped ile true olusuyor.

        // static olunca hiding oluyor ve method sadece kendi class icindeki metodu okuyor.--> Marsupial walks on the two legs: false

        k.getKangarooDescription();


    }
}

package minecraft;

public record class01240(String realmId) implements class01276 {
   public class01240(String realmId) {
      this.realmId = realmId;
   }

   public String y() {
      return this.realmId;
   }

   @Override
   public boolean N() {
      return !class05018.B(this.realmId);
   }
}

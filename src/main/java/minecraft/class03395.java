package minecraft;

public record class03395(long realmId, int slotId) implements class03405 {
   public class03395(class04981 var1) {
      this(var1.y, var1.T);
   }

   public class03395(long realmId, int slotId) {
      this.realmId = realmId;
      this.slotId = slotId;
   }

   public int y() {
      return this.slotId;
   }

   public long N() {
      return this.realmId;
   }
}

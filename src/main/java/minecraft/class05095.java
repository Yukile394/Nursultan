package minecraft;

public class class05095 extends class05134<class05095> {
   public class05095(String var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class05095 i() {
      try {
         this.N.setDoOutput(true);
         this.N.setRequestMethod("DELETE");
         this.N.connect();
         return this;
      } catch (Exception exception) {
         throw new class05121(exception.getMessage(), exception);
      }
   }
}

package minecraft;

import java.util.Collection;

public class class00430 implements class07409 {
   private final class05623 N;
   private final class07932 y;

   public class00430(class05623 var1, class07932 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void y(class07403 var1) {
      this.y.N(var1, "Kick unlisted players");
      this.N.yN();
   }

   @Override
   public void N(class07403 var1) {
      this.y.N(var1, "Clear allowlist");
      this.N.Nm().z().N();
   }

   @Override
   public void N(class08774 var1, class07403 var2) {
      this.y.N(var2, "Remove player '{}' from allowlist", var1);
      this.N.Nm().z().y(var1);
   }

   @Override
   public Collection<class05142> N() {
      return this.N.Nm().z().i();
   }

   @Override
   public boolean N(class05142 var1, class07403 var2) {
      this.y.N(var2, "Add player '{}' to allowlist", var1.B());
      return this.N.Nm().z().N(var1);
   }
}

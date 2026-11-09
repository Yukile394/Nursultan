package minecraft;

import java.util.Collection;

public class class00462 implements class07388 {
   private final class02796 N;
   private final class07932 y;

   public class00462(class02796 var1, class07932 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public Collection<class01072> y() {
      return this.N.Nm().B().i();
   }

   @Override
   public void y(class07403 var1) {
      this.N.Nm().M().N();
   }

   @Override
   public void N(class07403 var1) {
      this.y.N(var1, "Clear ip ban list");
      this.N.Nm().B().N();
   }

   @Override
   public void N(class01072 var1, class07403 var2) {
      this.y.N(var2, "Add ip '{}' to ban list", var1.B());
      this.N.Nm().B().N(var1);
   }

   @Override
   public void N(String var1, class07403 var2) {
      this.y.N(var2, "Remove ip '{}' from ban list", var1);
      this.N.Nm().B().y(var1);
   }

   @Override
   public Collection<class05157> N() {
      return this.N.Nm().M().i();
   }

   @Override
   public void N(class08774 var1, class07403 var2) {
      this.y.N(var2, "Remove player '{}' from banlist", var1);
      this.N.Nm().M().L(var1);
   }

   @Override
   public void N(class05157 var1, class07403 var2) {
      this.y.N(var2, "Add player '{}' to banlist. Reason: '{}'", var1.R(), var1.i().getString());
      this.N.Nm().M().N(var1);
   }
}

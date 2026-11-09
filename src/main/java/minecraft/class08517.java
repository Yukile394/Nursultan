package minecraft;

public record class08517(boolean usesBlockLight, class08388 particleIcon, class03702 transforms) {
   public class03702 L() {
      return this.transforms;
   }

   public class08517(boolean usesBlockLight, class08388 particleIcon, class03702 transforms) {
      super();
      this.usesBlockLight = usesBlockLight;
      this.particleIcon = particleIcon;
      this.transforms = transforms;
   }

   public class08388 y() {
      return this.particleIcon;
   }

   public void N(class08931 var1, class03662 var2) {
      var1.N(this.usesBlockLight);
      var1.N(this.particleIcon);
      var1.N(this.transforms.N(var2));
   }

   public static class08517 N(class02028 var0, class08529 var1, class08838 var2) {
      class08388 class08388 = var1.N(var2, var0);
      return new class08517(var1.i().N(), class08388, var1.R());
   }

   public boolean N() {
      return this.usesBlockLight;
   }
}

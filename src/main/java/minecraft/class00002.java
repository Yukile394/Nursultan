package minecraft;

public class class00002 implements class00124<class00002> {
   public static final class03069 N = new class03069("sounds", ".ogg");
   private final class01894 y;
   private final class03621 L;
   private final class03621 u;
   private final int i;
   private final class00022 R;
   private final boolean M;
   private final boolean B;
   private final int Z;

   public class03621 L() {
      return this.L;
   }

   public boolean M() {
      return this.M;
   }

   public class00002(class01894 var1, class03621 var2, class03621 var3, int var4, class00022 var5, boolean var6, boolean var7, int var8) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.B = var7;
      this.Z = var8;
   }

   @Override
   public String toString() {
      return "Sound[" + this.y + "]";
   }

   public boolean B() {
      return this.B;
   }

   public int Z() {
      return this.Z;
   }

   @Override
   public int i() {
      return this.i;
   }

   public class03621 u() {
      return this.u;
   }

   public class01894 y() {
      return N.N(this.y);
   }

   @Override
   public void N(class09038 var1) {
      if (this.B) {
         var1.N(this);
      }
   }

   public class01894 N() {
      return this.y;
   }

   public class00002 y(class06069 var1) {
      return this;
   }

   public class00022 R() {
      return this.R;
   }
}

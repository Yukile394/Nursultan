package minecraft;

import org.jspecify.annotations.Nullable;

public class class07333 implements class00381<class08051> {
   public static final class02362<class00667, class07333> N = class00381.N(class07333::N, class07333::new);
   private final int y;
   private final String L;
   private final boolean u;

   public class07333(int var1, String var2, boolean var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class07333(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.s();
      this.u = var1.readBoolean();
   }

   public boolean y() {
      return this.u;
   }

   @Nullable
   public class07327 N(class07299 var1) {
      class07049 class07049 = var1.method_8469(this.y);
      return class07049 instanceof class07480 ? ((class07480)class07049).U() : null;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.N(this.L);
      var1.writeBoolean(this.u);
   }

   public void method_65081(class08051 var1) {
      var1.method_12049(this);
   }

   public String N() {
      return this.L;
   }

   @Override
   public class02897<class07333> method_65080() {
      return class04248.LE;
   }
}

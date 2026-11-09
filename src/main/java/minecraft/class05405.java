package minecraft;

import java.net.InetSocketAddress;
import java.util.Objects;

class class05405 extends Thread {
   class05405(class05435 var1, String var2, String var3, int var4, class06202 var5, class04981 var6) {
      super(var2);
      this.i = var1;
      this.N = var3;
      this.y = var4;
      this.L = var5;
      this.u = var6;
   }

   @Override
   public void run() {
      InetSocketAddress inetsocketaddress = null;

      try {
         inetsocketaddress = new InetSocketAddress(this.N, this.y);
         if (this.i.L) {
            return;
         }

         this.i.u = class00642.method_10753(inetsocketaddress, class00606.N(((class05630)this.L.i_7).NC()), this.L.ND().U());
         if (this.i.L) {
            return;
         }

         class03464 class03464 = new class03464(this.i.u, this.L, this.u.L(this.N), this.i.y, false, null, var0 -> {}, new class05384(), null);
         if (this.u.z()) {
            class03464.N(this.u.b);
         }

         if (this.i.L) {
            return;
         }

         this.i.u.method_52902(this.N, this.y, class03464);
         if (this.i.L) {
            return;
         }

         this.i.u.method_10743(new class07816(this.L.Ny().L(), this.L.Ny().y()));
         this.L.N(class03415.N(this.u));
         this.L.Nl().N(class03371.field_44570, String.valueOf(this.u.y), Objects.requireNonNullElse(this.u.u, "unknown"));
         this.L.yL().N(this.i.u, class03826.field_47648);
      } catch (Exception exception) {
         this.L.yL().Z();
         if (this.i.L) {
            return;
         }

         class05435.N.error("Couldn't connect to world", exception);
         String s = exception.toString();
         if (inetsocketaddress != null) {
            String s1 = inetsocketaddress + ":" + this.y;
            s = s.replaceAll(s1, "");
         }

         class05364 class05364 = new class05364(this.i.y, class00392.L("mco.connect.failed"), class00392.N("disconnect.genericReason", s), class05220.U);
         this.L.execute(() -> var0.N(class05364));
      }
   }
}

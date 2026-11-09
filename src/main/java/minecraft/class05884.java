package minecraft;

import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class class05884 extends class05096 {
   public static final int N = 114;
   public static final int y = 126;
   public static final int L = 192;
   public static final int u = 192;
   public static final int i = 256;
   public static final int R = 256;
   private static final int M = 4;
   private static final int B = 98;
   private static final int Z = 157;
   private static final int z = 43;
   private static final int U = 116;
   private static final int E = 16;
   private static final int W = 148;
   private static final class00392 m = class00392.L("book.edit.title");
   private static final class00392 P = class00392.L("book.signButton");
   private final class08036 s;
   private final class06584 T;
   private final class08291 b;
   private int j;
   private final List<String> v = Lists.newArrayList();
   private class06005 n;
   private class06005 t;
   private final class07050 G;
   private class00392 l = class05220.N;
   private class03943 d;

   private int L() {
      return 2;
   }

   private void P() {
      if (this.N() < this.y(100)) {
         this.v.add("");
      }
   }

   public class05884(class08036 var1, class06584 var2, class07050 var3, class02699 var4) {
      super(m);
      this.s = var1;
      this.T = var2;
      this.G = var3;
      var4.N(class06202.Nq().yi()).forEach(this.v::add);
      if (this.v.isEmpty()) {
         this.v.add("");
      }

      this.b = new class08291(this, var1, var3, this.v);
   }

   private void Z() {
      if (this.j < this.N() - 1) {
         this.j++;
      } else {
         this.P();
         if (this.j < this.N() - 1) {
            this.j++;
         }
      }

      this.z();
      this.U();
   }

   private class00392 i() {
      return class00392.N("book.pageIndicator", this.j + 1, this.N()).y(-16777216).R();
   }

   private void m() {
      this.T.N(class02484.Ny, new class02699(this.v.stream().map(class02826::N).toList()));
   }

   private void U() {
      this.t.field_22764 = this.j > 0;
   }

   private void z() {
      this.d.N(this.v.get(this.j), true);
      this.l = this.i();
   }

   private int u() {
      return this.L() + 192 + 2;
   }

   private int y(int var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) ? 50 : var1;
   }

   private int y() {
      return (this.field_22789 - 192) / 2;
   }

   private void E() {
      ListIterator<String> listiterator = this.v.listIterator(this.v.size());

      while (listiterator.hasPrevious() && listiterator.previous().isEmpty()) {
         listiterator.remove();
      }
   }

   private void N(class00580 var1) {
      int ix = this.y();
      int jx = this.L();
      var1.N(class00937.field_62011, ix + 148, jx + 16, this.l);
   }

   private int N(int var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) ? 256 : var1;
   }

   private int N() {
      return this.v.size();
   }

   @Override
   public void method_25426() {
      int ix = this.y();
      int jx = this.L();
      byte b0 = 8;
      this.d = class03943.L()
         .L(false)
         .L(-16777216)
         .u(-16777216)
         .y(false)
         .N(false)
         .N((this.field_22789 - 114) / 2 - 8)
         .y(28)
         .N(this.field_22793, 122, 134, class05220.N);
      this.d.N(this.N(1024));
      this.d.y(126 / 9);
      this.d.N(var1x -> this.v.set(this.j, var1x));
      this.method_37063(this.d);
      this.z();
      this.l = this.i();
      this.t = this.method_37063(new class06005(ix + 43, jx + 157, false, var1x -> this.R(), true));
      this.n = this.method_37063(new class06005(ix + 116, jx + 157, true, var1x -> this.Z(), true));
      this.method_37063(class05362.method_46430(P, var1x -> this.field_22787.N(this.b)).N(this.field_22789 / 2 - 98 - 2, this.u()).N(98).N());
      this.method_37063(class05362.method_46430(class05220.u, var1x -> {
         this.field_22787.N(null);
         this.W();
      }).N(this.field_22789 / 2 + 2, this.u()).N(98).N());
      this.U();
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.d);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      switch (var1.v()) {
         case 266:
            this.t.method_25306(var1);
            return true;
         case 267:
            this.n.method_25306(var1);
            return true;
         default:
            return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      super.method_25420(var1, var2, var3, var4);
      var1.N(class08394.Na, class05671.i, this.y(), this.L(), 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.N(var1.B());
   }

   private void W() {
      this.E();
      this.m();
      int ix = this.G == class07050.field_5808 ? this.s.method_31548().N() : 40;
      this.field_22787.NE().N(new class00560(ix, this.v, Optional.empty()));
   }

   private void R() {
      if (this.j > 0) {
         this.j--;
         this.z();
      }

      this.U();
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), this.i());
   }
}

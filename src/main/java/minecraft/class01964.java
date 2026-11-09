package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class01964 extends class07633 {
   private static final int R = 1700;
   private static final int M = 6000;
   private static final int B = 30;
   private static final int Z = 120;
   private static final int X = 48000;
   private static final float p = 0.4F;
   private static final class01325 F = class01325.y(class07078.yb.z(), class07078.yb.U() - 0.4F).y(0.81F);
   private static final class02131<class01972> A = class03289.N(class01964.class, class02154.J);
   private static final class02131<Integer> f = class03289.N(class01964.class, class02154.y);
   public final class04396 N = new class04396();
   public final class04396 y = new class04396();
   public final class04396 L = new class04396();
   public final class04396 u = new class04396();
   public final class04396 i = new class04396();

   private class01972 w() {
      return this.field_6011.N(A);
   }

   @Override
   public void X() {
      super.X();
      if (this.method_5809() || this.method_5799()) {
         this.N(class04425.field_18, 0.0F);
      }
   }

   private class01964 Q() {
      this.method_5783(class04909.YK, 1.0F, this.method_6109() ? 1.3F : 1.0F);
      return this;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (A.equals(var1)) {
         class01972 class01972 = this.w();
         this.Y();
         switch (class01972) {
            case field_42666:
               this.N.y(this.field_6012);
               break;
            case field_42667:
               this.y.y(this.field_6012);
               break;
            case field_42668:
               this.L.y(this.field_6012);
            case field_42669:
            default:
               break;
            case field_42670:
               this.u.y(this.field_6012);
               break;
            case field_42671:
               this.i.y(this.field_6012);
         }

         this.method_18382();
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(A, class01972.field_42665);
      var1.N(f, 0);
   }

   @Override
   public void method_5773() {
      switch (this.w()) {
         case field_42669:
            this.NO();
            break;
         case field_42670:
            this.N(this.u).o();
      }

      super.method_5773();
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.YO, 0.15F, 1.0F);
   }

   public class01964(class07078<? extends class07633> var1, class07299 var2) {
      super(var1, var2);
      this.f().N(true);
      this.N(class04425.field_18, -1.0F);
      this.N(class04425.field_36432, -1.0F);
      this.N(class04425.field_43351, -1.0F);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.l, 0.1F).N(class05298.n, 14.0);
   }

   private class01964 I() {
      this.field_6011.N(f, this.field_6012 + 120);
      this.method_73183().method_8421(this, (byte)63);
      return this;
   }

   @Override
   protected class04891 s() {
      return Set.of(class01972.field_42670, class01972.field_42669).contains(this.w()) ? null : class04909.YI;
   }

   public boolean n() {
      return this.w() == class01972.field_42670 || this.w() == class01972.field_42669;
   }

   private class07209 l() {
      class06889 class06889 = this.d();
      return class07209.method_49637(class06889.N(), this.method_23318() + 0.2F, class06889.L());
   }

   private class06889 d() {
      return this.method_73189().i(this.method_5663().L(2.25));
   }

   @Override
   public void a() {
      this.N(class04425.field_18, -1.0F);
   }

   public boolean m() {
      return super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.A).orElse(false);
   }

   private void o() {
      if (this.method_73183() instanceof class04782 class04782 && this.field_6011.N(f) == this.field_6012) {
         class07209 class07209 = this.l();
         this.method_64169(class04782, class06273.NJ, (var2, var3x) -> {
            class00717 class00717 = new class00717(this.method_73183(), class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), var3x);
            class00717.L();
            var2.method_8649(class00717);
         });
         this.method_5783(class04909.Yq, 1.0F, 1.0F);
      }
   }

   Optional<class07209> t() {
      return IntStream.range(0, 5)
         .mapToObj(var1 -> class05456.N(this, 10 + 2 * var1, 3))
         .filter(Objects::nonNull)
         .map(class07209::method_49638)
         .filter(var1 -> this.method_73183().method_8621().N(var1))
         .map(class07209::method_10074)
         .filter(this::N)
         .findFirst();
   }

   public boolean v() {
      return !this.m() && !this.Nk() && !this.method_5799() && !this.NX() && this.method_24828() && !this.method_5765() && !this.g_();
   }

   @Override
   public void y(boolean var1) {
      this.u(var1 ? -48000 : 0);
   }

   private class01964 y(class07209 var1) {
      List list = this.NQ().limit(20L).collect(Collectors.toList());
      list.add(0, class06289.N(this.method_73183().method_27983(), var1));
      this.method_18868().N(class05378.yy, list);
      return this;
   }

   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.yb.N(var1, class06113.field_16466);
   }

   private class01964 y(class01972 var1) {
      this.field_6011.N(A, var1);
      return this;
   }

   public class01964 N(class01972 var1) {
      switch (var1) {
         case field_42665:
            this.y(class01972.field_42665);
            break;
         case field_42666:
            this.method_5783(class04909.YX, 1.0F, 1.0F);
            this.y(class01972.field_42666);
            break;
         case field_42667:
            this.y(class01972.field_42667).Q();
            break;
         case field_42668:
            this.method_5783(class04909.YV, 1.0F, 1.0F);
            this.y(class01972.field_42668);
            break;
         case field_42669:
            this.y(class01972.field_42669);
            break;
         case field_42670:
            this.y(class01972.field_42670).I();
            break;
         case field_42671:
            this.method_5783(class04909.Yc, 1.0F, 1.0F);
            this.y(class01972.field_42671);
      }

      return this;
   }

   @Override
   public boolean N(class07633 var1) {
      if (!(var1 instanceof class01964 class01964)) {
         return false;
      } else {
         Set set = Set.of(class01972.field_42665, class01972.field_42667, class01972.field_42666);
         return set.contains(this.w()) && set.contains(class01964.w()) && super.N(var1);
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      boolean flag = this.N(class06584);
      class07082 class07082 = super.N(var1, var2);
      if (class07082.N() && flag) {
         this.O();
      }

      return class07082;
   }

   public class01964 N(boolean var1) {
      if (var1) {
         this.y(this.method_23312());
      }

      return this;
   }

   private boolean N(class07209 var1) {
      return this.method_73183().method_8320(var1).N(class01210.LK)
         && this.NQ().noneMatch(var2 -> class06289.N(this.method_73183().method_27983(), var1).equals(var2))
         && Optional.ofNullable(this.f().N(var1, 1)).map(class00143::z).orElse(false);
   }

   private class01964 N(class04396 var1) {
      if (var1.N((float)this.field_6012) > 1700L && var1.N((float)this.field_6012) < 6000L) {
         class07209 class07209 = this.l();
         class00500 class00500 = this.method_73183().method_8320(class07209.method_10074());
         if (class00500.b() != class06898.field_11455) {
            for (int ix = 0; ix < 30; ix++) {
               class06889 class06889 = class06889.y(class07209).y(0.0, -0.65F, 0.0);
               this.method_73183().method_8406(new class07105(class07107.y, class00500), class06889.M, class06889.B, class06889.Z, 0.0, 0.0, 0.0);
            }

            if (this.field_6012 % 10 == 0) {
               this.method_73183()
                  .method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class00500.O().R(), this.method_5634(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.field_6012 % 10 == 0) {
         this.method_73183().N(class01194.n, this.l(), class01164.N(this));
      }

      return this;
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("snifferBrain");
      this.method_18868().N(var1, this);
      class04643.y("snifferActivityUpdate");
      class01984.y(this);
      class04643.L();
      super.N(var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NY);
   }

   @Override
   public void N(class04782 var1, class07633 var2) {
      class06584 class06584 = new class06584(class06570.Ez);
      class00717 class00717 = new class00717(var1, this.method_73189().N(), this.method_73189().y(), this.method_73189().L(), class06584);
      class00717.L();
      this.N(var1, var2, null);
      this.method_5783(class04909.Ya, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 0.5F);
      var1.method_8649(class00717);
   }

   public boolean W() {
      return this.w() == class01972.field_42669;
   }

   @Override
   protected void O() {
      this.method_73183().method_43129(null, this, class04909.Yg, class04911.field_15254, 1.0F, class04995.y(this.method_73183().field_9229, 0.8F, 1.2F));
   }

   @Override
   boolean G() {
      return !this.Nk()
         && !this.m()
         && !this.method_6109()
         && !this.method_5799()
         && this.method_24828()
         && !this.method_5765()
         && this.N(this.l().method_10074());
   }

   @Override
   public int NR() {
      return 50;
   }

   private void Y() {
      this.u.N();
      this.L.N();
      this.i.N();
      this.N.N();
      this.y.N();
   }

   private void NO() {
      if (this.method_73183().method_8608() && this.field_6012 % 20 == 0) {
         this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.Ye, this.method_5634(), 1.0F, 1.0F, false);
      }
   }

   @Override
   public boolean aa_() {
      return true;
   }

   @Override
   public class06889[] ab_() {
      return class02607.N(this, -0.01, 0.63, 0.38, 1.15);
   }

   private Stream<class06289> NQ() {
      return this.method_18868().L(class05378.yy).stream().flatMap(Collection::stream);
   }

   @Override
   public class05781<class01964> method_28306() {
      return class01289.N(class01984.y, class01984.N);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Yo;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.w() == class01972.field_42670 ? F.N(this.method_17825()) : super.method_55694(var1);
   }

   @Override
   public void method_6043() {
      super.method_6043();
      if (this.q.L() > 0.0 && this.method_18798().z() < 0.01) {
         this.method_5724(0.1F, new class06889(0.0, 0.0, 1.0));
      }
   }

   @Override
   public class01289<class01964> method_18868() {
      return (class01289<class01964>)super.method_18868();
   }

   @Override
   public void method_6078(class07072 var1) {
      this.N(class01972.field_42665);
      super.method_6078(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.YJ;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class01984.N(this.method_28306().N(var1));
   }
}

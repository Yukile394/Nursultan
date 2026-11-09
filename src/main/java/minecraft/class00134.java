package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public abstract class class00134<T extends class09037> extends class05096 {
   public static final class00392 y = class00392.L("menu.custom_screen_info.disconnect");
   private static final int N = 20;
   private static final class01883 L = new class01883(
      class01894.y("dialog/warning_button"), class01894.y("dialog/warning_button_disabled"), class01894.y("dialog/warning_button_highlighted")
   );
   private final T u;
   private final class03686 i = new class03686(this);
   @Nullable
   private final class05096 R;
   @Nullable
   private class00104 M;
   private class05362 B;
   private final class08781 Z;
   private Supplier<Optional<class00647>> z = class08770.N;

   @Nullable
   public class05096 L() {
      return this.R;
   }

   public class00134(@Nullable class05096 var1, T var2, class08781 var3) {
      super(var2.H_().y());
      this.u = (T)var2;
      this.R = var1;
      this.Z = var3;
   }

   private class05362 u() {
      class04897 class04897 = new class04897(
         0, 0, 20, 20, L, var1x -> this.field_22787.N(class00132.N(this.field_22787, this.Z, this)), class00392.L("menu.custom_screen_info.button_narration")
      );
      class04897.method_47400(class04141.N(class00392.L("menu.custom_screen_info.tooltip")));
      return class04897;
   }

   protected void y() {
      int ix = this.B.method_46426();
      int j = this.B.method_46427();
      if (ix < 0 || j < 0 || ix > this.field_22789 - 20 || j > this.field_22790 - 20) {
         this.B.method_46421(Math.max(0, this.field_22789 - 40));
         this.B.method_46419(Math.min(5, this.field_22790));
      }
   }

   private void N(class00647 var1, @Nullable class05096 var2) {
      switch (var1) {
         case class00625 class00625:
            String s1;
            try {
               s1 = class00625.y();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            String s = s1;
            this.Z.N(class07686.N(s), var2);
            break;
         case class00626 class00626:
            this.Z.N(class00626.y(), var2);
            break;
         case class00669 class00669:
            this.Z.N(class00669.y(), class00669.L());
            this.field_22787.N(var2);
            break;
         default:
            method_71847((class00647)var1, this.field_22787, var2);
      }
   }

   public void N(Optional<class00647> var1, class08782 var2) {
      Object object = switch (var2) {
         case field_60963 -> this;
         case field_60962 -> this.R;
         case field_60964 -> new class08739(this.R);
      };
      if (var1.isPresent()) {
         this.N((class00647)var1.get(), (class05096)object);
      } else {
         this.field_22787.N((class05096)object);
      }
   }

   public void N(Optional<class00647> var1) {
      this.N(var1, this.u.H_().R());
   }

   protected static class02102 N(List<? extends class02102> var0, int var1) {
      class02060 class02060 = new class02060();
      class02060.L().y();
      class02060.N(2).y(2);
      int ix = var0.size();
      int j = ix / var1;
      int k = j * var1;

      for (int l = 0; l < k; l++) {
         class02060.N((T)((class02102)var0.get(l)), l / var1, l % var1);
      }

      if (ix != k) {
         class01885 class01885 = class01885.i().N(2);
         class01885.L().y();

         for (int i1 = k; i1 < ix; i1++) {
            class01885.N((T)((class02102)var0.get(i1)));
         }

         class02060.N(class01885, j, 0, 1, var1);
      }

      return class02060;
   }

   protected void N(class03686 var1, class08770 var2, T var3, class08781 var4) {
   }

   protected void N(class01885 var1, class08770 var2, T var3, class08781 var4) {
   }

   protected class02102 N() {
      class01885 class01885 = class01885.i().N(10);
      class01885.L().y().i();
      class01885.N(new class02071(this.field_22785, this.field_22793));
      class01885.N(this.B);
      return class01885;
   }

   @Override
   public final void method_25426() {
      super.method_25426();
      this.B = this.u();
      this.B.method_48591(-10);
      class08770 class08770 = new class08770(this);
      class01885 class01885 = class01885.u().N(10);
      class01885.L().y();
      this.i.N(this.N());

      for (class09034 class09034 : this.u.H_().M()) {
         class02102 class02102 = class00103.N(this, class09034);
         if (class02102 != null) {
            class01885.N(class02102);
         }
      }

      for (class09009 class09009 : this.u.H_().B()) {
         class08770.N(class09009, class01885::N);
      }

      this.N(class01885, class08770, this.u, this.Z);
      this.M = new class00104(this.field_22787, class01885, this.i.u());
      this.i.L(this.M);
      this.N(this.i, class08770, this.u, this.Z);
      this.z = class08770.N(this.u.u());
      this.i.method_48206(var1x -> {
         if (var1x != this.B) {
            this.method_37063(var1x);
         }
      });
      this.method_37063(this.B);
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return this.u.H_().u();
   }

   @Override
   public void method_48640() {
      this.M.y(this.i.u());
      this.i.N();
      this.y();
   }

   @Override
   public void method_25419() {
      this.N(this.z.get(), class08782.field_60962);
   }

   @Override
   public boolean method_25421() {
      return this.u.H_().i();
   }
}

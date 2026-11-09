package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class06394 extends class06683 {
   private final class02796 y;
   private final Set<class00518> L = Sets.newHashSet();
   private boolean u;

   @Override
   public void L(class01766 var1) {
      super.L(var1);
      this.y.Nm().N(new class01785(var1.method_5820(), null));
      this.z();
   }

   @Override
   public void L(class00518 var1) {
      super.L(var1);
      this.z();
   }

   @Override
   public void L(class00502 var1) {
      super.L(var1);
      this.y.Nm().N(class02565.N(var1, false));
      this.i(var1);
      this.z();
   }

   public void M(class00518 var1) {
      List<class00381<?>> list = this.R(var1);

      for (class04770 class04770 : this.y.Nm().v()) {
         for (class00381<?> class00381 : list) {
            class04770.field_13987.method_14364(class00381);
         }
      }

      this.L.add(var1);
   }

   public class06394(class02796 var1) {
      super();
      this.y = var1;
   }

   public List<class00381<?>> B(class00518 var1) {
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(new class08091(var1, 1));

      for (class01890 class01890 : class01890.values()) {
         if (this.N(class01890) == var1) {
            arraylist.add(new class06642(class01890, var1));
         }
      }

      return arraylist;
   }

   public void Z(class00518 var1) {
      List<class00381<?>> list = this.B(var1);

      for (class04770 class04770 : this.y.Nm().v()) {
         for (class00381<?> class00381 : list) {
            class04770.field_13987.method_14364(class00381);
         }
      }

      this.L.remove(var1);
   }

   @Override
   public void i(class00518 var1) {
      super.i(var1);
      if (this.L.contains(var1)) {
         this.Z(var1);
      }

      this.z();
   }

   @Override
   public void i(class01766 var1, class00518 var2) {
      super.i(var1, var2);
      if (this.L.contains(var2)) {
         this.y.Nm().N(new class01785(var1.method_5820(), var2.L()));
      }

      this.z();
   }

   private void i(class00502 var1) {
      for (class04782 class04782 : this.y.NO()) {
         var1.B().stream().map(var1x -> this.y.Nm().N(var1x)).filter(Objects::nonNull).forEach(var1x -> class04782.method_70636().u(var1x));
      }
   }

   private class06645 U() {
      return new class06645(this.B(), this.R(), this.Z(), this.M());
   }

   protected void z() {
      this.u = true;
   }

   public int z(class00518 var1) {
      int i = 0;

      for (class01890 class01890 : class01890.values()) {
         if (this.N(class01890) == var1) {
            i++;
         }
      }

      return i;
   }

   @Override
   public void u(class00502 var1) {
      super.u(var1);
      this.y.Nm().N(class02565.N(var1));
      this.i(var1);
      this.z();
   }

   @Override
   public void u(class01766 var1, class00518 var2) {
      super.u(var1, var2);
      this.z();
   }

   @Override
   public void u(class00518 var1) {
      super.u(var1);
      if (this.L.contains(var1)) {
         this.y.Nm().N(new class08091(var1, 2));
      }

      this.z();
   }

   @Override
   public void y(String var1, class00502 var2) {
      super.y(var1, var2);
      this.y.Nm().N(class02565.N(var2, var1, class02724.field_29156));
      this.R(var1);
      this.z();
   }

   @Override
   public void y(class00502 var1) {
      super.y(var1);
      this.y.Nm().N(class02565.N(var1, true));
      this.z();
   }

   public void N(class06645 var1) {
      var1.N().forEach(var1x -> this.N(var1x));
      var1.y().forEach(var1x -> this.N(var1x));
      var1.L().forEach((var1x, var2) -> {
         class00518 class00518 = this.N(var2);
         this.N(var1x, class00518);
      });
      var1.u().forEach(var1x -> this.N(var1x));
   }

   @Override
   public void N(class01766 var1, class00518 var2, class00490 var3) {
      super.N(var1, var2, var3);
      if (this.L.contains(var2)) {
         this.y.Nm().N(new class08049(var1.method_5820(), var2.L(), var3.y(), Optional.ofNullable(var3.u()), Optional.ofNullable(var3.i())));
      }

      this.z();
   }

   public void N(class06676 var1) {
      if (this.u) {
         this.u = false;
         var1.N(this.U());
      }
   }

   @Override
   public boolean N(String var1, class00502 var2) {
      if (super.N(var1, var2)) {
         this.y.Nm().N(class02565.N(var2, var1, class02724.field_29155));
         this.R(var1);
         this.z();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void N(class01890 var1, @Nullable class00518 var2) {
      class00518 class00518 = this.N(var1);
      super.N(var1, var2);
      if (class00518 != var2 && class00518 != null) {
         if (this.z(class00518) > 0) {
            this.y.Nm().N(new class06642(var1, var2));
         } else {
            this.Z(class00518);
         }
      }

      if (var2 != null) {
         if (this.L.contains(var2)) {
            this.y.Nm().N(new class06642(var1, var2));
         } else {
            this.M(var2);
         }
      }

      this.z();
   }

   private void R(String var1) {
      class04770 class04770 = this.y.Nm().N(var1);
      if (class04770 != null) {
         class04770.method_51469().method_70636().u(class04770);
      }
   }

   public List<class00381<?>> R(class00518 var1) {
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(new class08091(var1, 0));

      for (class01890 class01890 : class01890.values()) {
         if (this.N(class01890) == var1) {
            arraylist.add(new class06642(class01890, var1));
         }
      }

      for (class01772 class01772 : this.N(var1)) {
         arraylist.add(new class08049(class01772.L(), var1.L(), class01772.u(), Optional.ofNullable(class01772.i()), Optional.ofNullable(class01772.R())));
      }

      return arraylist;
   }
}

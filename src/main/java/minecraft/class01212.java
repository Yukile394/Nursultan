package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import dev.isxander.yacl3.mixin.AbstractSelectionListAccessor;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class class01212<E extends class01202<E>>
   extends class01777
   implements AbstractSelectionListAccessor,
   page.langeweile.ok_zoomer.mixin.common.key_binds.AbstractSelectionListAccessor {
   private static final class01894 field_49478 = class01894.y("textures/gui/menu_list_background.png");
   private static final class01894 field_49892 = class01894.y("textures/gui/inworld_menu_list_background.png");
   private static final int field_62110 = 2;
   public final class06202 field_22740;
   protected final int field_62109;
   private final List<E> field_22739 = new class01218<>(this);
   protected boolean field_22744 = true;
   @Nullable
   private E field_22751;
   @Nullable
   private E field_33780;

   public class01212(class06202 var1, int var2, int var3, int var4, int var5) {
      super(0, var4, var2, var3, class05220.N);
      this.field_22740 = var1;
      this.field_62109 = var5;
   }

   @Override
   public List<E> method_25396() {
      return Collections.unmodifiableList(this.field_22739);
   }

   @Override
   public class03432 method_37018() {
      if (this.method_25370()) {
         return class03432.field_33786;
      } else {
         return this.field_33780 != null ? class03432.field_33785 : class03432.field_33784;
      }
   }

   @Override
   public void method_25365(boolean var1) {
      super.method_25365(var1);
      if (!var1) {
         this.method_25395(null);
      }
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      class01202 class01202x = this.method_25336();
      if (class01202x != var1 && class01202x instanceof class01295 class01295) {
         class01295.method_25395(null);
      }

      super.method_25395(var1);
      int i = this.field_22739.indexOf(var1);
      if (i >= 0) {
         class01202 class01202x = this.field_22739.get(i);
         this.method_25313((E)class01202x);
      }
   }

   @Override
   public Optional<class04654> method_19355(double var1, double var3) {
      return Optional.ofNullable(this.method_25308(var1, var3));
   }

   private List wrapOperation$edp000$yet_another_config_lib_v3$modifyChildrenCall(class01212 var1, Operation var2) {
      return this.method_25396();
   }

   @Nullable
   public E method_25334() {
      return this.field_22751;
   }

   @Nullable
   public E method_25336() {
      return (E)super.method_25399();
   }

   public void method_57712(int var1, class03686 var2) {
      this.method_57714(var1, var2.u(), var2.L());
   }

   @Override
   public void method_44382(double var1) {
      super.method_44382(var1);
      this.method_73367();
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      this.field_33780 = this.method_25405(var2, var3) ? this.method_25308(var2, var3) : null;
      this.method_57715(var1);
      this.method_49603(var1);
      this.method_25311(var1, var2, var3, var4);
      var1.R();
      this.method_57713(var1);
      this.method_44396(var1, var2, var3);
   }

   public int method_73370(E var1, int var2) {
      var1.method_46421(this.method_25342());
      var1.method_73381(this.method_25322());
      var1.method_46419(this.method_73378());
      var1.method_73383(var2);
      this.field_22739.add((E)var1);
      return this.field_22739.size() - 1;
   }

   public int method_25321(E var1) {
      return this.method_73370((E)var1, this.field_62109);
   }

   @Nullable
   protected E method_37019() {
      return this.field_33780;
   }

   private void method_73367() {
      int i = this.method_73376() - (int)this.method_44387();

      for (class01202 class01202 : this.field_22739) {
         class01202.method_46419(i);
         i += class01202.method_25364();
         class01202.method_46421(this.method_25342());
         class01202.method_73381(this.method_25322());
      }
   }

   protected void method_73374(E var1) {
      this.field_22739.removeIf(var1x -> var1x != var1);
      if (this.field_22751 != var1) {
         this.method_25313(null);
      }
   }

   public void method_25314(Collection<E> var1) {
      this.method_25339();

      for (class01202 class01202 : var1) {
         this.method_25321((E)class01202);
      }
   }

   private int method_73376() {
      return this.method_46427() + 2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public E method_48199(class03249 var1, Predicate<E> var2, @Nullable E var3) {
      byte b0 = switch (var1) {
         case field_41829, field_41828 -> 0;
         case field_41826 -> -1;
         case field_41827 -> 1;
      };
      if (!this.method_25396().isEmpty() && b0 != 0) {
         int i;
         if (var3 == null) {
            i = b0 > 0 ? 0 : this.method_25396().size() - 1;
         } else {
            i = this.method_25396().indexOf(var3) + b0;
         }

         for (int j = i; j >= 0 && j < this.wrapOperation$edp000$yet_another_config_lib_v3$modifyChildrenCall(this, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_350]");
            return ((class01212)var0[0]).field_22739;
         }).size(); j += b0) {
            class01202 class01202 = this.method_25396().get(j);
            if (var2.test(class01202)) {
               return (E)class01202;
            }
         }
      }

      return null;
   }

   public int method_73378() {
      int i = this.method_73376() - (int)this.method_44387();

      for (class01202 class01202 : this.field_22739) {
         i += class01202.method_25364();
      }

      return i;
   }

   protected void method_37017(class03428 var1, E var2) {
      List list = this.method_25396();
      if (list.size() > 1) {
         int i = list.indexOf(var2);
         if (i != -1) {
            var1.N(class03457.field_33789, class00392.N("narrator.position.list", i + 1, list.size()));
         }
      }
   }

   public void method_25339() {
      this.field_22739.clear();
      this.field_22751 = null;
   }

   public int method_25342() {
      return this.method_46426() + this.field_22758 / 2 - this.method_25322() / 2;
   }

   public void method_25313(@Nullable E var1) {
      this.field_22751 = (E)var1;
      if (var1 != null) {
         boolean flag = var1.method_73382() < this.method_46427();
         boolean flag1 = var1.method_73386() > this.method_55443();
         if (this.field_22740.Nc().y() || flag || flag1) {
            this.method_73377((E)var1);
         }
      }
   }

   protected void method_44399(E var1) {
      this.method_73375((E)var1, this.field_62109);
   }

   protected void method_73375(E var1, int var2) {
      double d0 = this.method_44390() - this.method_44387();
      var1.method_73383(var2);
      this.field_22739.addFirst((E)var1);
      this.method_73367();
      this.method_44382(this.method_44390() - d0);
   }

   public int method_25322() {
      return 220;
   }

   protected void method_73372(Comparator<E> var1) {
      this.field_22739.sort(var1);
      this.method_73367();
   }

   protected int method_25340() {
      return this.method_25396().size();
   }

   protected void method_73377(E var1) {
      int i = var1.method_46427() - this.method_46427() - 2;
      if (i < 0) {
         this.method_25309(i);
      }

      int j = this.method_55443() - var1.method_46427() - var1.method_25364() - 2;
      if (j < 0) {
         this.method_25309(-j);
      }
   }

   protected void method_73368(int var1, int var2) {
      Collections.swap(this.field_22739, var1, var2);
      this.method_73367();
      this.method_73377(this.field_22739.get(var2));
   }

   protected boolean method_73379() {
      return true;
   }

   void method_29621(class01202<E> var1) {
      var1.field_22752 = this;
   }

   private void method_25309(int var1) {
      this.method_44382(this.method_44387() + var1);
   }

   protected void method_25324(E var1) {
      int i = 0;

      for (class01202 class01202 : this.field_22739) {
         if (class01202 == var1) {
            i += class01202.method_25364() / 2;
            break;
         }

         i += class01202.method_25364();
      }

      this.method_44382(i - this.field_22759 / 2.0);
   }

   public void method_57714(int var1, int var2, int var3) {
      this.method_73369(var1, var2, 0, var3);
   }

   protected void method_44650(E var1) {
      double d0 = this.method_44390() - this.method_44387();
      this.method_25330((E)var1);
      this.method_44382(this.method_44390() - d0);
   }

   protected void method_49603(class01054 var1) {
      var1.L(this.method_46426(), this.method_46427(), this.method_55442(), this.method_55443());
   }

   protected void method_57715(class01054 var1) {
      class01894 class01894 = (class03448)this.field_22740.T_3 == null ? field_49478 : field_49892;
      var1.N(
         class08394.Na,
         class01894,
         this.method_46426(),
         this.method_46427(),
         (float)this.method_55442(),
         (float)(this.method_55443() + (int)this.method_44387()),
         this.method_25368(),
         this.method_25364(),
         32,
         32
      );
   }

   @Nullable
   protected E method_48197(class03249 var1) {
      return this.method_48198(var1, var0 -> true);
   }

   protected void method_44397(class01054 var1, int var2, int var3, float var4, E var5) {
      if (this.method_73379() && this.method_25334() == var5) {
         int i = this.method_25370() ? -1 : -8355712;
         this.method_44398(var1, (E)var5, i);
      }

      var5.method_25343(var1, var2, var3, Objects.equals(this.field_33780, var5), var4);
   }

   public int method_25319(int var1) {
      class01202 class01202 = this.field_22739.get(var1);
      return class01202.method_46427() + class01202.method_25364();
   }

   public void method_25311(class01054 var1, int var2, int var3, float var4) {
      for (class01202 class01202 : this.field_22739) {
         if (class01202.method_46427() + class01202.method_25364() >= this.method_46427() && class01202.method_46427() <= this.method_55443()) {
            this.method_44397(var1, var2, var3, var4, (E)class01202);
         }
      }
   }

   @Override
   protected int method_65507() {
      return this.method_31383() + 6 + 2;
   }

   public void method_73369(int var1, int var2, int var3, int var4) {
      this.method_55445(var1, var2);
      this.y(var3, var4);
      this.method_73367();
      if (this.method_25334() != null) {
         this.method_73377(this.method_25334());
      }

      this.method_65506();
   }

   @Nullable
   protected E method_48198(class03249 var1, Predicate<E> var2) {
      return this.method_48199(var1, var2, this.method_25334());
   }

   public int method_25337(int var1) {
      return this.field_22739.get(var1).method_46427();
   }

   protected void method_73373(List<E> var1) {
      var1.forEach(this::method_25330);
   }

   @Override
   public int method_44395() {
      int i = 0;

      for (class01202 class01202 : this.field_22739) {
         i += class01202.method_25364();
      }

      return i + 4;
   }

   @Override
   protected double method_44393() {
      return this.field_62109 / 2.0;
   }

   protected void method_57713(class01054 var1) {
      class01894 class01894x = (class03448)this.field_22740.T_3 == null ? class05096.field_49895 : class05096.field_49897;
      class01894 class01894x = (class03448)this.field_22740.T_3 == null ? class05096.field_49896 : class05096.field_49898;
      var1.N(class08394.Na, class01894x, this.method_46426(), this.method_46427() - 2, 0.0F, 0.0F, this.method_25368(), 2, 32, 2);
      var1.N(class08394.Na, class01894x, this.method_46426(), this.method_55443(), 0.0F, 0.0F, this.method_25368(), 2, 32, 2);
   }

   public void method_25330(E var1) {
      if (this.field_22739.remove(var1)) {
         this.method_73367();
         if (var1 == this.method_25334()) {
            this.method_25313(null);
         }
      }
   }

   public int method_31383() {
      return this.method_25342() + this.method_25322();
   }

   @Nullable
   public E method_25308(double var1, double var3) {
      for (class01202 class01202 : this.field_22739) {
         if (class01202.method_25405(var1, var3)) {
            return (E)class01202;
         }
      }

      return null;
   }

   public void method_44398(class01054 var1, E var2, int var3) {
      int i = var2.method_46426();
      int j = var2.method_46427();
      int k = i + var2.method_25368();
      int l = j + var2.method_25364();
      var1.N(i, j, k, l, var3);
      var1.N(i + 1, j + 1, k - 1, l - 1, -16777216);
   }
}

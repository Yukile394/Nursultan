package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import dev.isxander.yacl3.mixin.TabNavigationBarAccessor;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class03281 extends class04664 implements class01294, class03434, TabNavigationBarAccessor {
   private static final int field_42489 = -1;
   private static final int field_43076 = 400;
   private static final int field_43077 = 24;
   private static final int field_43078 = 14;
   private static final class00392 field_43079 = class00392.L("narration.tab_navigation.usage");
   private final class01885 field_43080 = class01885.i();
   private int field_42145;
   private final class03271 field_42146;
   private final ImmutableList<class03241> field_42147;
   private final ImmutableList<class03567> field_42148;

   public class03281(int var1, class03271 var2, Iterable<class03241> var3) {
      super();
      this.field_42145 = var1;
      this.field_42146 = var2;
      this.field_42147 = ImmutableList.copyOf(var3);
      this.field_43080.L().y();
      Builder builder = ImmutableList.builder();

      for (class03241 class03241 : var3) {
         builder.add(this.field_43080.N(new class03567(var2, class03241, 0, 24)));
      }

      this.field_42148 = builder.build();
   }

   public void method_48618(int var1) {
      this.field_42145 = var1;
   }

   public List<class03241> method_71284() {
      return this.field_42147;
   }

   public void method_48987(int var1, boolean var2) {
      if (this.method_25370()) {
         this.method_25395((class04654)this.field_42148.get(var1));
      } else if (((class03567)this.field_42148.get(var1)).method_37303()) {
         this.field_42146.N((class03241)this.field_42147.get(var1), var2);
      }
   }

   public void method_71522(int var1, boolean var2) {
      if (var1 >= 0 && var1 < this.field_42148.size()) {
         ((class03567)this.field_42148.get(var1)).field_22763 = var2;
      }
   }

   public void method_49613() {
      int i = Math.min(400, this.field_42145) - 28;
      int j = class04995.i(i / this.field_42147.size(), 2);
      UnmodifiableIterator<class03567> unmodifiableiterator = this.field_42148.iterator();

      while (unmodifiableiterator.hasNext()) {
         ((class03567)unmodifiableiterator.next()).method_25358(j);
      }

      this.field_43080.N();
      this.field_43080.method_46421(class04995.i((this.field_42145 - i) / 2, 2));
      this.field_43080.method_46419(0);
   }

   public static class03669 method_48623(class03271 var0, int var1) {
      return new class03669(var0, var1);
   }

   public void method_71521(int var1, @Nullable class04141 var2) {
      if (var1 >= 0 && var1 < this.field_42148.size()) {
         ((class03567)this.field_42148.get(var1)).method_47400(var2);
      }
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.field_42148;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.P()) {
         int i = this.method_48990(var1);
         if (i != -1) {
            this.method_48987(class04995.N(i, 0, this.field_42147.size() - 1), true);
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      if (!this.method_25370()) {
         class03567 class03567 = this.method_49615();
         if (class03567 != null) {
            return class02106.N(this, class02106.N(class03567));
         }
      }

      return var1 instanceof class03251 ? null : super.method_48205(var1);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      var1.N(
         class08394.Na,
         class05096.field_49895,
         0,
         this.field_43080.method_46427() + this.field_43080.method_25364() - 2,
         0.0F,
         0.0F,
         ((class03567)this.field_42148.get(0)).method_46426(),
         2,
         32,
         2
      );
      int i = ((class03567)this.field_42148.get(this.field_42148.size() - 1)).method_55442();
      var1.N(
         class08394.Na,
         class05096.field_49895,
         i,
         this.field_43080.method_46427() + this.field_43080.method_25364() - 2,
         0.0F,
         0.0F,
         this.field_42145,
         2,
         32,
         2
      );
      UnmodifiableIterator<class03567> unmodifiableiterator = this.field_42148.iterator();

      while (unmodifiableiterator.hasNext()) {
         ((class03567)unmodifiableiterator.next()).method_25394(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_37020(class03428 var1) {
      this.field_42148.stream().filter(class06478::method_49606).findFirst().or(() -> Optional.ofNullable(this.method_49615())).ifPresent(var2 -> {
         this.method_49612(var1.N(), var2);
         var2.method_37020(var1);
      });
      if (this.method_25370()) {
         var1.N(class03457.field_33791, field_43079);
      }
   }

   @Override
   public class03255 method_48202() {
      return this.field_43080.method_48202();
   }

   @Override
   public class03432 method_37018() {
      return this.field_42148.stream().map(class06478::method_37018).max(Comparator.naturalOrder()).orElse(class03432.field_33784);
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return var1 >= this.field_43080.method_46426()
         && var3 >= this.field_43080.method_46427()
         && var1 < this.field_43080.method_46426() + this.field_43080.method_25368()
         && var3 < this.field_43080.method_46427() + this.field_43080.method_25364();
   }

   @Override
   public void method_25365(boolean var1) {
      super.method_25365(var1);
      if (this.method_25399() != null) {
         this.method_25395(null);
      }
   }

   @Override
   public void method_25395(@Nullable class04654 var1) {
      super.method_25395(var1);
      if (var1 instanceof class03567 class03567 && class03567.method_37303()) {
         this.field_42146.N(class03567.y(), true);
      }
   }

   private int method_48990(class06601 var1) {
      return this.method_71520(this.method_48989(), var1);
   }

   private int method_71520(int var1, class06601 var2) {
      int i = var2.U();
      if (i != -1) {
         return Math.floorMod(i - 1, 10);
      } else if (var2.z() && var1 != -1) {
         int j = Math.floorMod(var2.W() ? var1 - 1 : var1 + 1, this.field_42147.size());
         return ((class03567)this.field_42148.get(j)).field_22763 ? j : this.method_71520(j, var2);
      } else {
         return -1;
      }
   }

   @Nullable
   private class03567 method_49615() {
      int i = this.method_48989();
      return i != -1 ? (class03567)this.field_42148.get(i) : null;
   }

   private int method_48989() {
      class03241 class03241 = this.field_42146.N();
      int i = this.field_42147.indexOf(class03241);
      return i != -1 ? i : -1;
   }

   protected void method_49612(class03428 var1, class03567 var2) {
      if (this.field_42147.size() > 1) {
         int i = this.field_42148.indexOf(var2);
         if (i != -1) {
            var1.N(class03457.field_33789, class00392.N("narrator.position.tab", i + 1, this.field_42147.size()));
         }
      }
   }
}

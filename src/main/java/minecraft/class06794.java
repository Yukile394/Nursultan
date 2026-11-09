package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06794 {
   public static final int N = Integer.MAX_VALUE;
   public static final BiConsumer<class06889, List<? extends class07049>> y = (var0, var1) -> {};
   private static final class01128<class07049, ?> L = new class06782();
   private final int u;
   private final boolean i;
   private final boolean R;
   private final List<Predicate<class07049>> M;
   @Nullable
   private final class00816 B;
   private final Function<class06889, class06889> Z;
   @Nullable
   private final class00734 z;
   private final BiConsumer<class06889, List<? extends class07049>> U;
   private final boolean E;
   @Nullable
   private final String W;
   @Nullable
   private final UUID m;
   private final class01128<class07049, ?> P;
   private final boolean s;

   public class04770 L(class07701 var1) throws CommandSyntaxException {
      this.i(var1);
      List<class04770> list = this.u(var1);
      if (list.size() != 1) {
         throw class07680.i.create();
      } else {
         return list.get(0);
      }
   }

   public boolean L() {
      return this.E;
   }

   public class06794(
      int var1,
      boolean var2,
      boolean var3,
      List<Predicate<class07049>> var4,
      @Nullable class00816 var5,
      Function<class06889, class06889> var6,
      @Nullable class00734 var7,
      BiConsumer<class06889, List<? extends class07049>> var8,
      boolean var9,
      @Nullable String var10,
      @Nullable UUID var11,
      @Nullable class07078<?> var12,
      boolean var13
   ) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.M = var4;
      this.B = var5;
      this.Z = var6;
      this.z = var7;
      this.U = var8;
      this.E = var9;
      this.W = var10;
      this.m = var11;
      this.P = (class01128<class07049, ?>)(var12 == null ? L : var12);
      this.s = var13;
   }

   private void i(class07701 var1) throws CommandSyntaxException {
      if (this.s && !var1.N().hasPermission(class08162.i)) {
         throw class07680.R.create();
      }
   }

   public boolean i() {
      return this.s;
   }

   public List<class04770> u(class07701 var1) throws CommandSyntaxException {
      this.i(var1);
      if (this.W != null) {
         class04770 class04770x = var1.W().Nm().N(this.W);
         return class04770x == null ? List.of() : List.of(class04770x);
      } else if (this.m != null) {
         class04770 class04770xx = var1.W().Nm().y(this.m);
         return class04770xx == null ? List.of() : List.of(class04770xx);
      } else {
         class06889 class06889 = this.Z.apply(var1.i());
         class00734 class00734 = this.N(class06889);
         Predicate<class07049> predicate = this.N(class06889, class00734, null);
         if (this.E) {
            return var1.M() instanceof class04770 class04770 && predicate.test(class04770) ? List.of(class04770) : List.of();
         } else {
            int ix = this.R();
            List<class04770> list;
            if (this.u()) {
               list = var1.R().method_47540(predicate, ix);
            } else {
               list = new ObjectArrayList();

               for (class04770 class04770xxx : var1.W().Nm().v()) {
                  if (predicate.test(class04770xxx)) {
                     list.add(class04770xxx);
                     if (list.size() >= ix) {
                        return list;
                     }
                  }
               }
            }

            return this.N(class06889, list);
         }
      }
   }

   public boolean u() {
      return this.R;
   }

   public List<? extends class07049> y(class07701 var1) throws CommandSyntaxException {
      this.i(var1);
      if (!this.i) {
         return this.u(var1);
      } else if (this.W != null) {
         class04770 class04770 = var1.W().Nm().N(this.W);
         return class04770 == null ? List.of() : List.of(class04770);
      } else if (this.m != null) {
         for (class04782 class04782 : var1.W().NO()) {
            class07049 class07049 = class04782.method_66347(this.m);
            if (class07049 != null) {
               if (class07049.method_5864().N(var1.G())) {
                  return List.of(class07049);
               }
               break;
            }
         }

         return List.of();
      } else {
         class06889 var2 = this.Z.apply(var1.i());
         class00734 class00734 = this.N(var2);
         if (this.E) {
            Predicate<class07049> predicate1 = this.N(var2, class00734, null);
            return var1.M() != null && predicate1.test(var1.M()) ? List.of(var1.M()) : List.of();
         } else {
            Predicate<class07049> predicate = this.N(var2, class00734, var1.G());
            ObjectArrayList objectarraylist = new ObjectArrayList();
            if (this.u()) {
               this.N(objectarraylist, var1.R(), class00734, predicate);
            } else {
               for (class04782 class04782x : var1.W().NO()) {
                  this.N(objectarraylist, class04782x, class00734, predicate);
               }
            }

            return this.N(var2, objectarraylist);
         }
      }
   }

   public boolean y() {
      return this.i;
   }

   public static class00392 N(List<? extends class07049> var0) {
      return class00390.y(var0, class07049::method_5476);
   }

   public class07049 N(class07701 var1) throws CommandSyntaxException {
      this.i(var1);
      List<? extends class07049> list = this.y(var1);
      if (list.isEmpty()) {
         throw class07680.u.create();
      } else if (list.size() > 1) {
         throw class07680.N.create();
      } else {
         return list.get(0);
      }
   }

   private void N(List<class07049> var1, class04782 var2, @Nullable class00734 var3, Predicate<class07049> var4) {
      int ix = this.R();
      if (var1.size() < ix) {
         if (var3 != null) {
            var2.method_47575(this.P, var3, var4, var1, ix);
         } else {
            var2.method_47539(this.P, var4, var1, ix);
         }
      }
   }

   public int N() {
      return this.u;
   }

   @Nullable
   private class00734 N(class06889 var1) {
      return this.z != null ? this.z.L(var1) : null;
   }

   private Predicate<class07049> N(class06889 var1, @Nullable class00734 var2, @Nullable class03767 var3) {
      boolean flag = var3 != null;
      boolean flag1 = var2 != null;
      boolean flag2 = this.B != null;
      int ix = (flag ? 1 : 0) + (flag1 ? 1 : 0) + (flag2 ? 1 : 0);
      List<Predicate<class07049>> list;
      if (ix == 0) {
         list = this.M;
      } else {
         ObjectArrayList objectarraylist = new ObjectArrayList(this.M.size() + ix);
         objectarraylist.addAll(this.M);
         if (flag) {
            objectarraylist.add(var1x -> var1x.method_5864().N(var3));
         }

         if (flag1) {
            objectarraylist.add(var1x -> var2.L(var1x.method_5829()));
         }

         if (flag2) {
            objectarraylist.add(var2x -> this.B.i(var2x.method_5707(var1)));
         }

         list = objectarraylist;
      }

      return class07536.N(list);
   }

   private <T extends class07049> List<T> N(class06889 var1, List<T> var2) {
      if (var2.size() > 1) {
         this.U.accept(var1, var2);
      }

      return var2.subList(0, Math.min(this.u, var2.size()));
   }

   private int R() {
      return this.U == y ? this.u : Integer.MAX_VALUE;
   }
}

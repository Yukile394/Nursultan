package minecraft;

import Nursultan.class09698;
import Nursultan.class09699;
import Nursultan.class09701;
import Nursultan.class09703;
import Nursultan.class09704;
import Nursultan.class09705;
import Nursultan.class09706;
import Nursultan.class10068;
import Nursultan.class10069;
import Nursultan.class10070;
import Nursultan.class10071;
import Nursultan.class10072;
import Nursultan.class10073;
import Nursultan.class10074;
import Nursultan.class10075;
import Nursultan.class10076;
import Nursultan.class10078;
import Nursultan.class10079;
import Nursultan.class10080;
import com.mojang.datafixers.util.Function10;
import com.mojang.datafixers.util.Function11;
import com.mojang.datafixers.util.Function12;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import com.mojang.datafixers.util.Function6;
import com.mojang.datafixers.util.Function7;
import com.mojang.datafixers.util.Function8;
import com.mojang.datafixers.util.Function9;
import io.netty.buffer.ByteBuf;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public interface class02362<B, V> extends class02874<B, V>, class02895<B, V> {
   default <O extends ByteBuf> class02362<O, V> y(Function<O, ? extends B> var1) {
      return new class09705<>(this, var1);
   }

   default <U> class02362<B, U> y(Function<? super U, ? extends V> var1, Function<? super V, ? extends class02362<? super B, ? extends U>> var2) {
      return new class10072<>(this, var2, var1);
   }

   static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      class02362<? super B, T7> var12,
      Function<C, T7> var13,
      class02362<? super B, T8> var14,
      Function<C, T8> var15,
      class02362<? super B, T9> var16,
      Function<C, T9> var17,
      Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, C> var18
   ) {
      return new class10080<>(var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var1, var3, var5, var7, var9, var11, var13, var15, var17);
   }

   static <B, C, T1, T2, T3, T4, T5, T6, T7, T8> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      class02362<? super B, T7> var12,
      Function<C, T7> var13,
      class02362<? super B, T8> var14,
      Function<C, T8> var15,
      Function8<T1, T2, T3, T4, T5, T6, T7, T8, C> var16
   ) {
      return new class10075<>(var0, var2, var4, var6, var8, var10, var12, var14, var16, var1, var3, var5, var7, var9, var11, var13, var15);
   }

   static <B, C, T1, T2, T3, T4, T5, T6, T7> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      class02362<? super B, T7> var12,
      Function<C, T7> var13,
      Function7<T1, T2, T3, T4, T5, T6, T7, C> var14
   ) {
      return new class10068<>(var0, var2, var4, var6, var8, var10, var12, var14, var1, var3, var5, var7, var9, var11, var13);
   }

   static <B, C, T1, T2, T3, T4, T5, T6> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      Function6<T1, T2, T3, T4, T5, T6, C> var12
   ) {
      return new class10071<>(var0, var2, var4, var6, var8, var10, var12, var1, var3, var5, var7, var9, var11);
   }

   static <B, C, T1, T2, T3, T4, T5> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      Function5<T1, T2, T3, T4, T5, C> var10
   ) {
      return new class10073<>(var0, var2, var4, var6, var8, var10, var1, var3, var5, var7, var9);
   }

   static <B, T> class02362<B, T> N_32(UnaryOperator<class02362<B, T>> var0) {
      return new class09701<>(var0);
   }

   static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      class02362<? super B, T7> var12,
      Function<C, T7> var13,
      class02362<? super B, T8> var14,
      Function<C, T8> var15,
      class02362<? super B, T9> var16,
      Function<C, T9> var17,
      class02362<? super B, T10> var18,
      Function<C, T10> var19,
      class02362<? super B, T11> var20,
      Function<C, T11> var21,
      class02362<? super B, T12> var22,
      Function<C, T12> var23,
      Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, C> var24
   ) {
      return new class09698<>(
         var0,
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var14,
         var16,
         var18,
         var20,
         var22,
         var24,
         var1,
         var3,
         var5,
         var7,
         var9,
         var11,
         var13,
         var15,
         var17,
         var19,
         var21,
         var23
      );
   }

   static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      class02362<? super B, T7> var12,
      Function<C, T7> var13,
      class02362<? super B, T8> var14,
      Function<C, T8> var15,
      class02362<? super B, T9> var16,
      Function<C, T9> var17,
      class02362<? super B, T10> var18,
      Function<C, T10> var19,
      class02362<? super B, T11> var20,
      Function<C, T11> var21,
      Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, C> var22
   ) {
      return new class10069<>(
         var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22, var1, var3, var5, var7, var9, var11, var13, var15, var17, var19, var21
      );
   }

   static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      class02362<? super B, T5> var8,
      Function<C, T5> var9,
      class02362<? super B, T6> var10,
      Function<C, T6> var11,
      class02362<? super B, T7> var12,
      Function<C, T7> var13,
      class02362<? super B, T8> var14,
      Function<C, T8> var15,
      class02362<? super B, T9> var16,
      Function<C, T9> var17,
      class02362<? super B, T10> var18,
      Function<C, T10> var19,
      Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, C> var20
   ) {
      return new class10074<>(
         var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var1, var3, var5, var7, var9, var11, var13, var15, var17, var19
      );
   }

   default <S extends B> class02362<S, V> N() {
      return this;
   }

   default <O> class02362<B, O> N_10(Function<? super V, ? extends O> var1, Function<? super O, ? extends V> var2) {
      return new class09704<>(this, var1, var2);
   }

   default <O> class02362<B, O> N_33(class02876<B, V, O> var1) {
      return var1.apply(this);
   }

   static <B, V> class02362<B, V> N(V var0) {
      return new class09699<>(var0);
   }

   static <B, V> class02362<B, V> N_34(class02880<B, V> var0, class02895<B, V> var1) {
      return new class09706<>(var1, var0);
   }

   static <B, V> class02362<B, V> N(class02874<B, V> var0, class02895<B, V> var1) {
      return new class09703<>(var1, var0);
   }

   static <B, C, T1, T2, T3, T4> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      class02362<? super B, T4> var6,
      Function<C, T4> var7,
      Function4<T1, T2, T3, T4, C> var8
   ) {
      return new class10076<>(var0, var2, var4, var6, var8, var1, var3, var5, var7);
   }

   static <B, C, T1, T2, T3> class02362<B, C> N(
      class02362<? super B, T1> var0,
      Function<C, T1> var1,
      class02362<? super B, T2> var2,
      Function<C, T2> var3,
      class02362<? super B, T3> var4,
      Function<C, T3> var5,
      Function3<T1, T2, T3, C> var6
   ) {
      return new class10078<>(var0, var2, var4, var6, var1, var3, var5);
   }

   static <B, C, T1, T2> class02362<B, C> N(
      class02362<? super B, T1> var0, Function<C, T1> var1, class02362<? super B, T2> var2, Function<C, T2> var3, BiFunction<T1, T2, C> var4
   ) {
      return new class10070<>(var0, var2, var4, var1, var3);
   }

   static <B, C, T1> class02362<B, C> N(class02362<? super B, T1> var0, Function<C, T1> var1, Function<T1, C> var2) {
      return new class10079<>(var0, var2, var1);
   }
}

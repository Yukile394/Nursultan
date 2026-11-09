package minecraft;

import Nursultan.class10518;
import com.mojang.authlib.GameProfile;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import org.jspecify.annotations.Nullable;

public class class05523 {
   private final class05513 N;
   private boolean y;

   public void L(class07078<?> var1, int var2, int var3, int var4) {
      this.L(var1, new class07209(var2, var3, var4));
   }

   public void L(class07078<?> var1, class07209 var2) {
      class07209 class07209 = this.z(var2);
      if (!this.N().method_74143(var1, new class00734(class07209), class07049::method_5805)) {
         throw this.N(var2, "test.error.expected_entity", var1.M());
      }
   }

   public <T extends class07049> List<T> L(class07078<T> var1) {
      return this.N().method_18023(var1, this.z(), class07049::method_5805);
   }

   public void L(class07209 var1) {
      this.N(var1, this.N(class07282.field_9220));
   }

   public void L(class00891 var1, class07209 var2) {
      this.y(() -> this.N(var1, var2));
   }

   public void L(class00891 var1, int var2, int var3, int var4) {
      this.L(var1, new class07209(var2, var3, var4));
   }

   @Deprecated(
      forRemoval = true
   )
   public class04770 L() {
      class03713 class03713 = class03713.N(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      class10518 class10518 = new class10518(this, this.N().method_8503(), this.N(), class03713.N(), class03713.L());
      class00642 class00642 = new class00642(class00423.field_11941);
      new EmbeddedChannel(new ChannelHandler[]{class00642});
      this.N().method_8503().Nm().N(class00642, class10518, class03713);
      return class10518;
   }

   public void L(Runnable var1) {
      this.N.T().N(var1).N(() -> this.N("test.error.fail"));
   }

   public class06993 M() {
      return this.N.n();
   }

   public void M(class07209 var1) {
      class07209 class07209 = this.z(var1);
      class04782 class04782 = this.N();
      class04782.method_8320(class07209).y(class04782, class07209, class04782.field_9229);
   }

   public class05523(class05513 var1) {
      super();
      this.N = var1;
   }

   public void B(class07209 var1) {
      class07209 class07209 = this.z(var1);
      class04782 class04782 = this.N();
      class04782.method_8320(class07209).N(class04782, class07209, class04782.field_9229);
   }

   public class07211 B() {
      return this.N.n().N(class07211.field_11035);
   }

   public void Z(class07209 var1) {
      class07209 class07209 = this.z(var1);
      this.N().method_52370(class07209);
   }

   public long Z() {
      return this.N.s();
   }

   public void i(Runnable var1) {
      LongStream.range(this.N.s(), this.N.l()).forEach(var2 -> this.N.N(var2, var1::run));
   }

   public void i(class07078<?> var1, int var2, int var3, int var4) {
      this.i(var1, new class07209(var2, var3, var4));
   }

   public void i(class07078<?> var1, class07209 var2) {
      this.y(() -> this.L(var1, var2));
   }

   public void i() {
      class00734 class00734 = this.U();
      int i = (int)Math.floor(class00734.u);
      int j = (int)Math.floor(class00734.R);
      int k = (int)Math.floor(class00734.i);

      for (int l = (int)Math.floor(class00734.N); l < i; l++) {
         for (int i1 = (int)Math.floor(class00734.L); i1 < j; i1++) {
            this.Z(new class07209(l, k, i1));
         }
      }
   }

   public void i(class07209 var1) {
      this.N().N(this.z(var1), false, null);
   }

   public class07209 U(class07209 var1) {
      class07209 class07209 = this.N.u();
      class06993 class06993 = this.N.n().N(class06993.field_11464);
      return class01207.N(var1, class07111.field_11302, class06993, class07209).method_10059(class07209);
   }

   public class00734 U() {
      class00734 class00734 = this.N.i();
      class06993 class06993 = this.N.n();
      switch (class06993) {
         case field_11465:
         case field_11463:
            return new class00734(0.0, 0.0, 0.0, class00734.u(), class00734.L(), class00734.y());
         default:
            return new class00734(0.0, 0.0, 0.0, class00734.y(), class00734.L(), class00734.u());
      }
   }

   public class07209 z(class07209 var1) {
      class07209 class07209 = this.N.u();
      return class01207.N(class07209.method_10081(var1), class07111.field_11302, this.N.n(), class07209);
   }

   public class00734 z() {
      return this.N.i();
   }

   public void u() {
      this.N.W();
   }

   public void u(class07209 var1) {
      this.N(class00869.uD, var1);
      class07209 class07209 = this.z(var1);
      class00500 class00500 = this.N().method_8320(class07209);
      ((class07127)class00500.i()).y_8(class00500, this.N(), class07209, null);
   }

   public void u(class07078<?> var1) {
      List list = this.N().method_18023(var1, this.z(), class07049::method_5805);
      if (!list.isEmpty()) {
         throw this.N(((class07049)list.getFirst()).method_24515(), "test.error.unexpected_entity", var1.M());
      }
   }

   public void u(Runnable var1) {
      LongStream.range(this.N.s(), this.N.l()).forEach(var2 -> this.N.N(var2, var1::run));
   }

   public void u(class07078<?> var1, int var2, int var3, int var4) {
      this.u(var1, new class07209(var2, var3, var4));
   }

   public void u(class07078<?> var1, class07209 var2) {
      class07209 class07209 = this.z(var2);
      if (this.N().method_74143(var1, new class00734(class07209), class07049::method_5805)) {
         throw this.N(var2, "test.error.unexpected_entity", var1.M());
      }
   }

   public void y(class07209 var1, class00500 var2) {
      class00500 class00500 = this.N(var1);
      if (!class00500.equals(var2)) {
         throw this.N(var1, "test.error.state_not_equal", var2, class00500);
      }
   }

   public void y(class07209 var1, class06581 var2) {
      if (this.N(var1, class07236.class).N_61(var2) == 0) {
         throw this.N(var1, "test.error.expected_container_contents", var2.U());
      }
   }

   public <E extends class07049 & class04391> void y(class07209 var1, class07078<E> var2, class06581 var3) {
      class07209 class07209 = this.z(var1);
      List list = this.N().method_18023(var2, new class00734(class07209), var0 -> var0.method_5805());
      if (list.isEmpty()) {
         throw this.N(var1, "test.error.expected_entity", var2.M());
      } else {
         Iterator iterator = list.iterator();

         while (iterator.hasNext()) {
            if (((class04391)((class07049)iterator.next())).n().N_60(var1x -> var1x.N(var3))) {
               return;
            }
         }

         throw this.N(var1, "test.error.expected_entity_having", var3.U());
      }
   }

   public void y(class07078<?> var1) {
      if (!this.N().method_74143(var1, this.z(), class07049::method_5805)) {
         throw this.N("test.error.expected_entity_in_test", var1.M());
      }
   }

   public void y(class07209 var1, Predicate<class00500> var2, Function<class00500, class00392> var3) {
      class00500 class00500 = this.N(var1);
      if (!var2.test(class00500)) {
         throw this.N(var1, (class00392)var3.apply(class00500));
      }
   }

   public void y(class06581 var1, class07209 var2, double var3) {
      class07209 class07209 = this.z(var2);
      Predicate predicate = var1x -> var1x.method_5805() && var1x.N().N(var1);
      if (this.N().method_74143(class07078.Nt, new class00734(class07209).M(var3), predicate)) {
         throw this.N(var2, "test.error.unexpected_item", var1.U());
      }
   }

   public <T extends class07049> List<T> y(class07078<T> var1, class07209 var2, double var3) {
      class07209 class07209 = this.z(var2);
      return this.N().method_18023(var1, new class00734(class07209).M(var3), class07049::method_5805);
   }

   public void y(class07078<?> var1, class00734 var2) {
      class00734 class00734 = this.N(var2);
      List list = this.N().method_18023(var1, class00734, class07049::method_5805);
      if (!list.isEmpty()) {
         throw this.N(((class07049)list.getFirst()).method_24515(), "test.error.unexpected_entity", var1.M());
      }
   }

   public void y(class06581 var1) {
      Predicate predicate = var1x -> var1x.method_5805() && var1x.N().N(var1);
      if (this.N().method_74143(class07078.Nt, this.z(), predicate)) {
         throw this.N("test.error.unexpected_item", var1.U());
      }
   }

   public void y(class07078<?> var1, double var2, double var4, double var6) {
      class06889 class06889x = new class06889(var2, var4, var6);
      class06889 class06889x = this.N(class06889x);
      Predicate predicate = var1x -> !var1x.method_5829().N(class06889, class06889);
      if (!this.N().method_74143(var1, this.z(), predicate)) {
         throw this.N("test.error.expected_entity_not_touching", var1.M(), class06889x.N(), class06889x.y(), class06889x.L(), var2, var4, var6);
      }
   }

   public void y() {
      this.N(class07049.class);
   }

   public void y(boolean var1, String var2) {
      this.y(var1, class00392.y(var2));
   }

   public void y(class00392 var1) {
      throw this.N(var1);
   }

   public void y(long var1, Runnable var3) {
      this.N(this.N.s() + var1, var3);
   }

   public void y(Runnable var1) {
      this.E();
      this.N.T().N(var1).N();
   }

   public class00734 y(class00734 var1) {
      class06889 class06889x = this.y(var1.B());
      class06889 class06889x = this.y(var1.Z());
      return new class00734(class06889x, class06889x);
   }

   public class06889 y(class06889 var1) {
      class06889 class06889 = class06889.N(this.N.u());
      return class01207.N(var1.u(class06889), class07111.field_11302, this.N.n(), this.N.u());
   }

   public void y(boolean var1, class00392 var2) {
      this.N(!var1, var2);
   }

   public <E extends class07079> E y(class07078<E> var1, class06889 var2) {
      class07079 class07079 = this.N(var1, var2);
      class07079.Nd();
      return (E)class07079;
   }

   public void y(class00891 var1, int var2, int var3, int var4) {
      this.y(var1, new class07209(var2, var3, var4));
   }

   public class07438 y(class07438 var1) {
      var1.method_6033(0.25F);
      return var1;
   }

   public void y(class07209 var1) {
      this.N(class01210.R, var1);
      class07209 class07209 = this.z(var1);
      class00500 class00500 = this.N().method_8320(class07209);
      ((class00889)class00500.i()).N(class00500, this.N(), class07209, null);
   }

   public void y(int var1, int var2, int var3) {
      this.u(new class07209(var1, var2, var3));
   }

   public <E extends class07079> E y(class07078<E> var1, int var2, int var3, int var4) {
      return this.y(var1, new class07209(var2, var3, var4));
   }

   public <E extends class07049> List<E> y(class07078<E> var1, int var2, int var3, int var4, double var5) {
      return this.N(var1, class06889.L(new class07209(var2, var3, var4)), var5);
   }

   public <E extends class07079> E y(class07078<E> var1, class07209 var2) {
      class07079 class07079 = this.N(var1, var2);
      class07079.Nd();
      return (E)class07079;
   }

   public <E extends class07049, T> void y(class07209 var1, class07078<E> var2, Function<E, T> var3, T var4) {
      this.y(() -> this.N(var1, var2, var3, var4));
   }

   public <E extends class07079> E y(class07078<E> var1, float var2, float var3, float var4) {
      return this.y(var1, new class06889(var2, var3, var4));
   }

   public void y(class00891 var1, class07209 var2) {
      this.N(var2, var3 -> !this.N(var2).N(var1), var1x -> class00392.N("test.error.unexpected_block", var1.M()));
   }

   private void E() {
      if (this.y) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.y = true;
      }
   }

   public void N(class07079 var1, float var2, float var3, float var4) {
      class06889 class06889 = this.N(new class06889(var2, var3, var4));
      var1.method_5808(class06889.M, class06889.B, class06889.Z, var1.method_36454(), var1.method_36455());
   }

   public void N(class05946<class00780> var1) {
      class00734 class00734 = this.z();
      class07209 class07209x = class07209.method_49637(class00734.N, class00734.y, class00734.L);
      class07209 class07209x = class07209.method_49637(class00734.u, class00734.i, class00734.R);
      if (class04207.N(this.N(), class07209x, class07209x, this.N().method_30349().L(class04227.NA).y(var1)).right().isPresent()) {
         throw this.N("test.error.set_biome");
      }
   }

   public void N(class08036 var1, class06584 var2, class07209 var3, class07211 var4) {
      class07209 class07209 = this.z(var3.method_10093(var4));
      class06183 class06183 = new class06183(class06889.y(class07209), var4, class07209, false);
      class06501 class06501 = new class06501(var1, class07050.field_5808, class06183);
      var2.N(class06501);
   }

   public <E extends class07049> E N(class07078<E> var1, float var2, float var3, float var4) {
      return this.N(var1, new class06889(var2, var3, var4));
   }

   public void N(Consumer<class07209> var1) {
      class07218.method_29715(this.U().N(1.0, 1.0, 1.0)).forEach(var1);
   }

   public <E extends class07049> E N(class07078<E> var1, int var2, int var3, int var4) {
      return this.N(var1, new class07209(var2, var3, var4));
   }

   public <E extends class07049> List<E> N(class07078<E> var1, class06889 var2, int var3) {
      ArrayList arraylist = new ArrayList();

      for (int i = 0; i < var3; i++) {
         arraylist.add(this.N(var1, var2));
      }

      return arraylist;
   }

   public class00734 N(class00734 var1) {
      class06889 class06889x = this.N(var1.B());
      class06889 class06889x = this.N(var1.Z());
      return new class00734(class06889x, class06889x);
   }

   public class06889 N(class06889 var1) {
      return class01207.N(class06889.N(this.N.u()).i(var1), class07111.field_11302, this.N.n(), this.N.u());
   }

   public void N(int var1, int var2, int var3) {
      this.y(new class07209(var1, var2, var3));
   }

   public void N(class07209 var1, class08036 var2) {
      class07209 class07209 = this.z(var1);
      this.N(var1, var2, new class06183(class06889.y(class07209), class07211.field_11043, class07209, true));
   }

   public void N(class07209 var1, class08036 var2, class06183 var3) {
      class07209 class07209 = this.z(var1);
      class00500 class00500 = this.N().method_8320(class07209);
      class07050 class07050 = class07050.field_5808;
      class07082 class07082 = class00500.N(var2.method_5998(class07050), this.N(), var2, class07050, var3);
      if (!class07082.N()) {
         if (!(class07082 instanceof class07087) || !class00500.N(this.N(), var2, var3).N()) {
            class06501 class06501 = new class06501(var2, class07050, var3);
            var2.method_5998(class07050).N(class06501);
         }
      }
   }

   public class00500 N(class07209 var1) {
      return this.N().method_8320(this.z(var1));
   }

   public void N(boolean var1, class00392 var2) {
      if (!var1) {
         throw this.N(var2);
      }
   }

   public void N(boolean var1, String var2) {
      this.N(var1, class00392.y(var2));
   }

   public <N> void N(N var1, N var2, String var3) {
      this.N(var1, var2, class00392.y(var3));
   }

   public <N> void N(N var1, N var2, class00392 var3) {
      if (!var1.equals(var2)) {
         throw this.N("test.error.value_not_equal", var3, var1, var2);
      }
   }

   public class07211 N(class07211 var1) {
      return this.M().N(var1);
   }

   public class05882 N(class07079 var1, class07209 var2, float var3) {
      return this.R().N(2, () -> {
         class00143 class00143 = var1.f().N(this.z(var2), 0);
         var1.f().N(class00143, (double)var3);
      });
   }

   public class04782 N() {
      return this.N.M();
   }

   public void N(class07049 var1) {
      var1.method_5768(this.N());
   }

   public void N(class07049 var1, class07072 var2, float var3) {
      var1.method_64397(this.N(), var2, var3);
   }

   public <E extends class07049> E N_52(class07078<E> var1, class06889 var2, @Nullable class06113 var3) {
      class04782 class04782 = this.N();
      class07049 class07049 = var1.N(class04782, class06113.field_16474);
      if (class07049 == null) {
         throw this.N(class07209.method_49638(var2), "test.error.spawn_failure", var1.T().M());
      } else {
         if (class07049 instanceof class07079 class07079x) {
            class07079x.NW();
         }

         class06889 class06889 = this.N(var2);
         float f = class07049.method_5832(this.M());
         class07049.method_5808(class06889.M, class06889.B, class06889.Z, f, class07049.method_36455());
         class07049.method_5636(f);
         class07049.method_5847(f);
         if (var3 != null && class07049 instanceof class07079 class07079) {
            class07079.N(this.N(), this.N().method_8404(class07079.method_24515()), var3, null);
         }

         class04782.y(class07049);
         return (E)class07049;
      }
   }

   public <E extends class07049> E N(class07078<E> var1, class06889 var2) {
      return this.N_52(var1, var2, null);
   }

   public <E extends class07079> E N(class07078<E> var1, int var2, int var3, int var4, class06113 var5) {
      return this.N_52(var1, new class06889(var2, var3, var4), var5);
   }

   public class05511 N(String var1, Object... var2) {
      return this.N((class00392)class00392.y(var1, var2));
   }

   public class05519 N(class07209 var1, class00392 var2) {
      return new class05519(var2, this.z(var1), var1, this.N.s());
   }

   public <E extends class07049> List<E> N(class07078<E> var1, class06889 var2, double var3) {
      class04782 class04782 = this.N();
      class06889 class06889 = this.N(var2);
      class00734 class00734x = this.N.i();
      class00734 class00734x = new class00734(class06889.y(-var3, -var3, -var3), class06889.y(var3, var3, var3));
      return class04782.method_18023(var1, class00734x, var1x -> var1x.method_5829().L(class00734) && var1x.method_5805());
   }

   public class05519 N(class07209 var1, String var2, Object... var3) {
      return this.N(var1, class00392.y(var2, var3));
   }

   public class05511 N(class00392 var1) {
      return new class05511(var1, this.N.s());
   }

   public <E extends class07049> E N(class07078<E> var1) {
      return this.N(var1, 0, 0, 0, 2.147483647E9);
   }

   public <E extends class07049> E N(class07078<E> var1, int var2, int var3, int var4, double var5) {
      List list = this.y(var1, var2, var3, var4, var5);
      if (list.isEmpty()) {
         throw this.N("test.error.expected_entity_around", var1.M(), var2, var3, var4);
      } else if (list.size() > 1) {
         throw this.N("test.error.too_many_entities", var1.B(), var2, var3, var4, list.size());
      } else {
         class06889 class06889 = this.N(new class06889(var2, var3, var4));
         list.sort((var1x, var2x) -> {
            double d0 = var1x.method_73189().R(class06889);
            double d1 = var2x.method_73189().R(class06889);
            return Double.compare(d0, d1);
         });
         return (E)list.get(0);
      }
   }

   public void N(class06581 var1) {
      Predicate predicate = var1x -> var1x.method_5805() && var1x.N().N(var1);
      if (!this.N().method_74143(class07078.Nt, this.z(), predicate)) {
         throw this.N("test.error.expected_item", var1.U());
      }
   }

   public <E extends class07049> E N(class07078<E> var1, class07209 var2) {
      return this.N(var1, class06889.L(var2));
   }

   public void N(class03530<class00891> var1, class07209 var2) {
      this.y(var2, var1x -> var1x.N(var1), var1x -> class00392.N("test.error.expected_block_tag", class00392.N(var1.y()), var1x.i().M()));
   }

   public void N(class00891 var1, class07209 var2) {
      class00500 class00500 = this.N(var2);
      this.N(var2, var2x -> class00500.N(var1), var1x -> class00392.N("test.error.expected_block", var1.M(), var1x.M()));
   }

   public void N(class07049 var1, class07209 var2) {
      class07209 class07209 = this.z(var2);
      this.N()
         .method_18023(var1.method_5864(), new class00734(class07209), class07049::method_5805)
         .stream()
         .filter(var1x -> var1x == var1)
         .findFirst()
         .orElseThrow(() -> this.N(var2, "test.error.expected_entity", var1.method_5864().M()));
   }

   public void N(class06581 var1, class07209 var2, double var3, int var5) {
      class07209 class07209 = this.z(var2);
      List list = this.N().method_18023(class07078.Nt, new class00734(class07209).M(var3), class07049::method_5805);
      int i = 0;
      Iterator iterator = list.iterator();

      while (iterator.hasNext()) {
         class06584 class06584 = ((class00717)iterator.next()).N();
         if (class06584.N(var1)) {
            i += class06584.c();
         }
      }

      if (i != var5) {
         throw this.N(var2, "test.error.expected_items_count", var5, var1.U(), i);
      }
   }

   public void N(class06581 var1, class07209 var2, double var3) {
      class07209 class07209 = this.z(var2);
      Predicate predicate = var1x -> var1x.method_5805() && var1x.N().N(var1);
      if (!this.N().method_74143(class07078.Nt, new class00734(class07209).M(var3), predicate)) {
         throw this.N(var2, "test.error.expected_item", var1.U());
      }
   }

   public class00717 N(class06581 var1, class07209 var2) {
      return this.N(var1, (float)var2.method_10263(), (float)var2.method_10264(), (float)var2.method_10260());
   }

   public <E extends class07049, T> void N(class07209 var1, class07078<E> var2, Function<? super E, T> var3, @Nullable T var4) {
      this.N(new class00734(var1), var2, var3, var4);
   }

   public <E extends class07049, T> void N(class00734 var1, class07078<E> var2, Function<? super E, T> var3, @Nullable T var4) {
      List list = this.N().method_18023(var2, this.N(var1), class07049::method_5805);
      if (list.isEmpty()) {
         throw this.N(class07209.method_49638(var1.M()), "test.error.expected_entity", var2.M());
      } else {
         for (class07049 class07049 : list) {
            Object object = var3.apply(class07049);
            if (!Objects.equals(object, var4)) {
               throw this.N(class07209.method_49638(var1.M()), "test.error.expected_entity_data", var4, object);
            }
         }
      }
   }

   public <E extends class07438> void N(class07209 var1, class07078<E> var2, class06581 var3) {
      class07209 class07209 = this.z(var1);
      List list = this.N().method_18023(var2, new class00734(class07209), class07049::method_5805);
      if (list.isEmpty()) {
         throw this.N(var1, "test.error.expected_entity", var2.M());
      } else {
         Iterator iterator = list.iterator();

         while (iterator.hasNext()) {
            if (((class07438)iterator.next()).method_24518(var3)) {
               return;
            }
         }

         throw this.N(var1, "test.error.expected_entity_holding", var3.U());
      }
   }

   public void N(class07209 var1, class00500 var2, class07211 var3) {
      class00500 class00500 = var2;
      if (var2.y(class07101.R)) {
         class00500 = var2.y(class07101.R, var3);
      }

      if (var2.y(class06665.F)) {
         class00500 = var2.y(class06665.F, var3);
      }

      this.N().method_8652(this.z(var1), class00500, 3);
   }

   public <E extends class07049, T> void N(class07209 var1, class07078<E> var2, Predicate<E> var3) {
      class07209 class07209 = this.z(var1);
      List list = this.N().method_18023(var2, new class00734(class07209), class07049::method_5805);
      if (list.isEmpty()) {
         throw this.N(var1, "test.error.expected_entity", var2.M());
      } else {
         for (class07049 class07049 : list) {
            if (!var3.test(class07049)) {
               throw this.N(class07049.method_24515(), "test.error.expected_entity_data_predicate", class07049.method_5477());
            }
         }
      }
   }

   public void N(class00891 var1, int var2, int var3, int var4) {
      this.N(var1, new class07209(var2, var3, var4));
   }

   public void N(class07078<?> var1, double var2, double var4, double var6) {
      class06889 class06889x = new class06889(var2, var4, var6);
      class06889 class06889x = this.N(class06889x);
      Predicate predicate = var1x -> var1x.method_5829().N(class06889, class06889);
      if (!this.N().method_74143(var1, this.z(), predicate)) {
         throw this.N("test.error.expected_entity_touching", var1.M(), class06889x.N(), class06889x.y(), class06889x.L(), var2, var4, var6);
      }
   }

   public <T extends Comparable<T>> void N(class07209 var1, class08092<T> var2, T var3) {
      class00500 class00500 = this.N(var1);
      if (!class00500.y(var2)) {
         throw this.N(var1, "test.error.block_property_missing", var2.R(), var3);
      } else if (!class00500.L(var2).equals(var3)) {
         throw this.N(var1, "test.error.block_property_mismatch", var2.R(), var3, class00500.L(var2));
      }
   }

   public class00717 N(class06581 var1, float var2, float var3, float var4) {
      return this.N(var1, new class06889(var2, var3, var4));
   }

   public class00717 N(class06581 var1, class06889 var2) {
      class04782 class04782 = this.N();
      class06889 class06889 = this.N(var2);
      class00717 class00717 = new class00717(class04782, class06889.M, class06889.B, class06889.Z, new class06584(var1, 1));
      class00717.method_18800(0.0, 0.0, 0.0);
      class04782.method_8649(class00717);
      return class00717;
   }

   public void N(class07078<?> var1, class00734 var2) {
      class00734 class00734 = this.N(var2);
      if (!this.N().method_74143(var1, class00734, class07049::method_5805)) {
         throw this.N(class07209.method_49638(var2.R()), "test.error.expected_entity", var1.M());
      }
   }

   public void N(class07209 var1, class07211 var2, IntPredicate var3, Supplier<class00392> var4) {
      class07209 class07209 = this.z(var1);
      class04782 class04782 = this.N();
      int i = class04782.method_8320(class07209).N(class04782, class07209, var2);
      if (!var3.test(i)) {
         throw this.N(var1, (class00392)var4.get());
      }
   }

   public <T extends class00394> void N(class07209 var1, Class<T> var2, Predicate<T> var3, Supplier<class00392> var4) {
      class00394 class00394 = this.N(var1, var2);
      if (!var3.test(class00394)) {
         throw this.N(var1, (class00392)var4.get());
      }
   }

   public <T extends Comparable<T>> void N(class07209 var1, class08092<T> var2, Predicate<T> var3, class00392 var4) {
      this.y(var1, var2x -> {
         if (!var2x.y(var2)) {
            return false;
         } else {
            Comparable comparable = var2x.L(var2);
            return var3.test(comparable);
         }
      }, var1x -> var4);
   }

   public void N(class07078<?> var1, class07209 var2, double var3) {
      if (this.y(var1, var2, var3).isEmpty()) {
         class07209 class07209 = this.z(var2);
         throw this.N(var2, "test.error.expected_entity", var1.M());
      }
   }

   public void N(class07209 var1, Predicate<class00891> var2, Function<class00891, class00392> var3) {
      this.y(var1, var1x -> var2.test(var1x.i()), var1x -> (class00392)var3.apply(var1x.i()));
   }

   public void N(Class<? extends class07049> var1) {
      class00734 class00734 = this.z();
      this.N().<class07049>N(var1, class00734.M(1.0), var0 -> !(var0 instanceof class08036)).forEach(var1x -> var1x.method_5768(this.N()));
   }

   public void N(class07049 var1, int var2, int var3, int var4) {
      this.N(var1, new class07209(var2, var3, var4));
   }

   public void N(class07078<?> var1, class07209 var2, int var3, double var4) {
      class07209 class07209 = this.z(var2);
      List list = this.y(var1, var2, var4);
      if (list.size() != var3) {
         throw this.N(var2, "test.error.expected_entity_count", var3, var1.M(), list.size());
      }
   }

   public void N(class07078<?> var1, int var2) {
      List list = this.N().method_18023(var1, this.z(), class07049::method_5805);
      if (list.size() != var2) {
         throw this.N("test.error.expected_entity_count", var2, var1.M(), list.size());
      }
   }

   public void N(class07078<?> var1, class00734 var2, class00392 var3) {
      class00734 class00734 = this.N(var2);
      if (!this.N().method_74143(var1, class00734, class07049::method_5805)) {
         throw this.N(class07209.method_49638(var2.R()), var3);
      }
   }

   public void N(Runnable var1) {
      this.E();
      this.N.T().N(0L, var1).N();
   }

   public void N(class07209 var1, long var2) {
      this.N(var1, class00869.BF);
      this.y(var2, () -> this.N(var1, class00869.N));
   }

   public void N(int var1, Runnable var2) {
      this.E();
      this.N.T().N((long)var1, var2).N();
   }

   public void N(long var1, Runnable var3) {
      this.N.N(var1, var3);
   }

   public void N(int var1, int var2, int var3, class00891 var4) {
      this.N(new class07209(var1, var2, var3), var4);
   }

   public class07438 N(class07438 var1) {
      var1.method_5855(0);
      var1.method_6033(0.25F);
      return var1;
   }

   public void N(int var1, int var2, int var3, class00500 var4) {
      this.N(new class07209(var1, var2, var3), var4);
   }

   public void N(class00392 var1, class07049 var2) {
      throw this.N(var2.method_24515(), var1);
   }

   public void N(class00392 var1, class07209 var2) {
      throw this.N(var2, var1);
   }

   public int N(class07830 var1, int var2, int var3) {
      class07209 class07209 = this.z(new class07209(var2, 0, var3));
      return this.U(this.N().N(var1, class07209)).method_10264();
   }

   public class08036 N(class07282 var1) {
      return new class05529(this, this.N(), new GameProfile(UUID.randomUUID(), "test-mock-player"), var1);
   }

   public <E extends class07049> List<E> N(class07078<E> var1, class07209 var2, int var3) {
      return this.N(var1, class06889.L(var2), var3);
   }

   public <T extends class00394> T N(class07209 var1, Class<T> var2) {
      class00394 class00394 = this.N().method_8321(this.z(var1));
      if (class00394 == null) {
         throw this.N(var1, "test.error.missing_block_entity");
      } else if (var2.isInstance(class00394)) {
         return (T)var2.cast(class00394);
      } else {
         throw this.N(var1, "test.error.wrong_block_entity", class00394.O().method_53254().M());
      }
   }

   public void N(class05163 var1, class07209 var2) {
      class07209.method_23627(var1).forEach(var3 -> {
         class07209 class07209 = var2.method_10069(var3.method_10263() - var1.B(), var3.method_10264() - var1.Z(), var3.method_10260() - var1.z());
         this.N(var3, class07209);
      });
   }

   public void N(class07209 var1, class07209 var2) {
      class00500 class00500x = this.N(var1);
      class00500 class00500x = this.N(var2);
      if (class00500x != class00500x) {
         throw this.N(var1, "test.error.state_not_equal", class00500x, class00500x);
      }
   }

   public void N(long var1, class07209 var3, class06581 var4) {
      this.N(var1, () -> this.N(var3, var4));
   }

   public void N(long var1, class07209 var3) {
      this.N(var1, () -> this.R(var3));
   }

   public void N(class07209 var1, class00891 var2, class07211 var3) {
      this.N(var1, var2.W(), var3);
   }

   public void N(class07209 var1, class06581 var2) {
      if (this.N(var1, class07236.class).N_61(var2) != 1) {
         throw this.N(var1, "test.error.expected_container_contents_single", var2.U());
      }
   }

   public void N(String var1) {
      throw this.N((class00392)class00392.y(var1));
   }

   public void N(class07438 var1, class03556<class07084> var2, int var3) {
      class07055 class07055 = var1.method_6112(var2);
      if (class07055 == null || class07055.i() != var3) {
         throw this.N("test.error.expected_entity_effect", var1.method_5477(), class06517.N(var2, var3));
      }
   }

   public void N(class07209 var1, class00891 var2) {
      this.N(var1, var2.W());
   }

   public <E extends class07049, T> void N(E var1, Function<E, T> var2, T var3, class00392 var4) {
      Object object = var2.apply(var1);
      if (!object.equals(var3)) {
         throw this.N(var1.method_24515(), "test.error.entity_property_details", var1.method_5477(), var4, object, var3);
      }
   }

   public void N(class07209 var1, class00500 var2) {
      this.N().method_8652(this.z(var1), var2, 3);
   }

   public <E extends class07049> void N(E var1, Predicate<E> var2, class00392 var3) {
      if (!var2.test(var1)) {
         throw this.N(var1.method_24515(), "test.error.entity_property", var1.method_5477(), var3);
      }
   }

   public void R(class07209 var1) {
      if (!this.N(var1, class07236.class).method_5442()) {
         throw this.N(var1, "test.error.expected_empty_container");
      }
   }

   public class05882 R() {
      return this.N.T();
   }

   public void R(class07078<?> var1, class07209 var2) {
      this.y(() -> this.u(var1, var2));
   }

   public void R(class07078<?> var1, int var2, int var3, int var4) {
      this.R(var1, new class07209(var2, var3, var4));
   }
}

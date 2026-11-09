package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

class class08250 implements class08529 {
   private static final class08251<Boolean> R = N(0);
   private static final class08251<class00140> M = N(1);
   private static final class08251<class08534> B = N(2);
   private static final class08251<class03702> Z = N(3);
   private static final class08251<class08838> z = N(4);
   private static final class08251<class08388> U = N(5);
   private static final class08251<class08496> E = N(6);
   private static final int W = 7;
   private final class01894 m;
   boolean N;
   @Nullable
   class08250 y;
   final class00167 L;
   private final AtomicReferenceArray<Object> P = new AtomicReferenceArray<>(7);
   private final Map<class04673, class08496> s = new ConcurrentHashMap<>();

   @Override
   public String L() {
      return this.m.toString();
   }

   @Override
   public class08534 M() {
      return this.N_88(B, class08529::u);
   }

   class08250(class01894 var1, class00167 var2, boolean var3) {
      super();
      this.m = var1;
      this.L = var2;
      this.N = var3;
   }

   @Override
   public class08838 B() {
      return this.N_88(z, class08529::N);
   }

   @Override
   public class00140 i() {
      return this.N_88(M, class08529::L);
   }

   @Override
   public boolean u() {
      return this.N_88(R, class08529::y);
   }

   private class08496 y(class08838 var1, class02028 var2, class04673 var3) {
      class08496 class08496 = this.N(E);
      return class08496 != null ? class08496 : this.N(E, this.M().bake(var1, var2, var3, this));
   }

   @Nullable
   @Override
   public class08529 y() {
      return this.y;
   }

   @Override
   public class08496 N(class08838 var1, class02028 var2, class04673 var3) {
      return var3 == class08510.N ? this.y(var1, var2, var3) : this.s.computeIfAbsent(var3, var3x -> this.M().bake(var1, var2, var3x, this));
   }

   @Override
   public class08388 N(class08838 var1, class02028 var2) {
      class08388 class08388 = this.N(U);
      return class08388 != null ? class08388 : this.N(U, class08529.N(var1, var2, this));
   }

   @Override
   public class00167 N() {
      return this.L;
   }

   private static <T> class08251<T> N(int var0) {
      Objects.checkIndex(var0, 7);
      return new class08251<>(var0);
   }

   private <T> T N(class08251<T> var1, T var2) {
      Object object = this.P.compareAndExchange(var1.N(), null, var2);
      return (T)(object == null ? var2 : object);
   }

   @Nullable
   private <T> T N(class08251<T> var1) {
      return (T)this.P.get(var1.N());
   }

   private <T> T N_88(class08251<T> var1, Function<class08529, T> var2) {
      Object object = this.N(var1);
      return (T)(object != null ? object : this.N(var1, (T)var2.apply(this)));
   }

   @Override
   public class03702 R() {
      return this.N_88(Z, class08529::i);
   }
}

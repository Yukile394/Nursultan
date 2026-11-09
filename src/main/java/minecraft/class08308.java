package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import net.fabricmc.fabric.api.serialization.v1.view.FabricReadView;
import org.jspecify.annotations.Nullable;

public class class08308 implements class08299, FabricReadView {
   private final class04490 N;
   private final class08296 y;
   private final class07001 L;

   @Override
   public Optional<class08319> L(String var1) {
      class07741 class07741 = this.N(var1, class07741.N);
      return class07741 != null ? Optional.of(this.N(var1, this.y, class07741)) : Optional.empty();
   }

   @Override
   public <T> class08310<T> L(String var1, Codec<T> var2) {
      class07741 class07741 = this.N(var1, class07741.N);
      return class07741 != null ? this.N(var1, class07741, var2) : this.y.i();
   }

   @Override
   public Optional<String> M(String var1) {
      class07707 class07707 = this.N(var1, class07707.N);
      return class07707 != null ? Optional.of(class07707.U()) : Optional.empty();
   }

   private class08308(class04490 var1, class08296 var2, class07001 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public Optional<int[]> B(String var1) {
      class06995 class06995 = this.N(var1, class06995.N);
      return class06995 != null ? Optional.of(class06995.M()) : Optional.empty();
   }

   @Nullable
   private class07737 Z(String var1) {
      class07709 class07709 = this.L.N(var1);
      if (class07709 == null) {
         return null;
      } else if (class07709 instanceof class07737) {
         return (class07737)class07709;
      } else {
         this.N.N_47(new class08313(var1, class07709.u()));
         return null;
      }
   }

   @Override
   public Optional<Integer> i(String var1) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? Optional.of(class07737.B()) : Optional.empty();
   }

   public boolean contains(String var1) {
      return this.L.y(var1);
   }

   public Collection keys() {
      return this.L.i();
   }

   @Override
   public class08319 u(String var1) {
      class07741 class07741 = this.N(var1, class07741.N);
      return class07741 != null ? this.N(var1, this.y, class07741) : this.y.u();
   }

   @Override
   public class08299 y(String var1) {
      class07001 class07001 = this.N(var1, class07001.y);
      return class07001 != null ? this.N(var1, class07001) : this.y.L();
   }

   @Override
   public <T> Optional<class08310<T>> y(String var1, Codec<T> var2) {
      class07741 class07741 = this.N(var1, class07741.N);
      return class07741 != null ? Optional.of(this.N(var1, class07741, var2)) : Optional.empty();
   }

   @Override
   public String N(String var1, String var2) {
      class07707 class07707 = this.N(var1, class07707.N);
      return class07707 != null ? class07707.U() : var2;
   }

   private <T> class08310<T> N(String var1, class07741 var2, Codec<T> var3) {
      return (class08310<T>)(var2.isEmpty() ? this.y.i() : new class08318<>(this.N, var1, this.y, var3, var2));
   }

   @Override
   public double N(String var1, double var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.U() : var2;
   }

   @Override
   public float N(String var1, float var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.E() : var2;
   }

   static class08299 N(class04490 var0, class08296 var1, class07001 var2) {
      return (class08299)(var2.z() ? var1.L() : new class08308(var0, var1, var2));
   }

   private class08299 N(String var1, class07001 var2) {
      return (class08299)(var2.z() ? this.y.L() : new class08308(this.N.N_46(new class10419(var1)), this.y, var2));
   }

   @Override
   public class01929 N() {
      return this.y.y();
   }

   private class08319 N(String var1, class08296 var2, class07741 var3) {
      return (class08319)(var3.isEmpty() ? var2.u() : new class08295(this.N, var1, var2, var3));
   }

   @Override
   public boolean N(String var1, boolean var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.z() != 0 : var2;
   }

   @Override
   public Optional<class08299> N(String var1) {
      class07001 class07001 = this.N(var1, class07001.y);
      return class07001 != null ? Optional.of(this.N(var1, class07001)) : Optional.empty();
   }

   public static class08299 N(class04490 var0, class01929 var1, class07001 var2) {
      return new class08308(var0, new class08296(var1, class07713.N), var2);
   }

   @Override
   public <T> Optional<T> N(MapCodec<T> var1) {
      DynamicOps<class07709> dynamicops = this.y.N();
      Object object1;
      Objects.requireNonNull(object1);
      Object object = object1;

      dynamicops.getMap(this.L).flatMap(var2x -> var1.decode(dynamicops, var2x));
      return switch (object) {
         case Success success -> Optional.of(((Success)object).value());
         case Error error -> {
            this.N.N_47(new class08333(error));
            yield error.partialValue();
         }
         default -> throw new MatchException(null, null);
      };
   }

   @Override
   public <T> Optional<T> N(String var1, Codec<T> var2) {
      class07709 class07709 = this.L.N(var1);
      if (class07709 == null) {
         return Optional.empty();
      } else {
         Object object1;
         Objects.requireNonNull(object1);
         Object object = object1;

         var2.parse(this.y.N(), class07709);
         return switch (object) {
            case Success success -> Optional.of(((Success)object).value());
            case Error error -> {
               this.N.N_47(new class08335(var1, class07709, error));
               yield error.partialValue();
            }
            default -> throw new MatchException(null, null);
         };
      }
   }

   public static class08319 N(class04490 var0, class01929 var1, List<class07001> var2) {
      return new class08316(var0, new class08296(var1, class07713.N), var2);
   }

   @Nullable
   private <T extends class07709> T N(String var1, class01424<T> var2) {
      class07709 class07709 = this.L.N(var1);
      if (class07709 == null) {
         return null;
      } else {
         class01424<?> class01424 = class07709.u();
         if (class01424 != var2) {
            this.N.N_47(new class08305(var1, var2, class01424));
            return null;
         } else {
            return (T)class07709;
         }
      }
   }

   @Override
   public long N(String var1, long var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.M() : var2;
   }

   @Override
   public int N(String var1, int var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.B() : var2;
   }

   @Override
   public int N(String var1, short var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.Z() : var2;
   }

   @Override
   public byte N(String var1, byte var2) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? class07737.z() : var2;
   }

   @Override
   public Optional<Long> R(String var1) {
      class07737 class07737 = this.Z(var1);
      return class07737 != null ? Optional.of(class07737.M()) : Optional.empty();
   }

   public Optional getOptionalLongArray(String var1) {
      return this.L.E(var1);
   }

   public Optional getOptionalByteArray(String var1) {
      return this.L.z(var1);
   }
}

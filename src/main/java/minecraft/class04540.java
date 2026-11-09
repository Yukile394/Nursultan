package minecraft;

import Nursultan.class10422;
import Nursultan.class10440;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import net.caffeinemc.mods.lithium.common.util.collections.HashedReferenceList;
import org.jspecify.annotations.Nullable;

public final class class04540<E> {
   private static final int N = 64;
   private final int y;
   private List<class04523<E>> L;
   @Nullable
   private final class04537<E> u;

   public boolean L() {
      return this.L.isEmpty();
   }

   class04540(List<? extends class04523<E>> var1) {
      super();
      this.L = this.N(var1);
      this.y = class04531.N(var1, class04523::y);
      if (this.y == 0) {
         this.u = null;
      } else if (this.y < 64) {
         this.u = new class10440<>(this.L, this.y);
      } else {
         this.u = new class10422<>(this.L);
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class04540 class04540) ? false : this.y == class04540.y && Objects.equals(this.L, class04540.L);
      }
   }

   @Override
   public int hashCode() {
      int i = this.y;
      return 31 * i + this.L.hashCode();
   }

   public List<class04523<E>> u() {
      return this.L;
   }

   public E y(class06069 var1) {
      if (this.u == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int i = var1.y(this.y);
         return this.u.N(i);
      }
   }

   public static <E> Codec<class04540<E>> y(Codec<E> var0) {
      return class06338.y(class04523.N(var0).listOf()).xmap(class04540::N, class04540::u);
   }

   public static <E> Codec<class04540<E>> y(MapCodec<E> var0) {
      return class06338.y(class04523.N(var0).listOf()).xmap(class04540::N, class04540::u);
   }

   public boolean y(E var1) {
      Iterator iterator = this.L.iterator();

      while (iterator.hasNext()) {
         if (((class04523)iterator.next()).N().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public static <E> class02136<E> y() {
      return new class02136<>();
   }

   public static <E, B extends ByteBuf> class02362<B, class04540<E>> N(class02362<B, E> var0) {
      return class04523.<B, E>N(var0).N_33(class02389.N()).N_10(class04540::N, class04540::u);
   }

   public static <E> class04540<E> N(E var0) {
      return new class04540<>(List.of(new class04523<>((E)var0, 1)));
   }

   public static <E> class04540<E> N() {
      return new class04540<>(List.of());
   }

   private List<class04523<E>> N(Collection var1) {
      return (List<class04523<E>>)(var1.size() > 4 ? new HashedReferenceList(var1) : new ReferenceArrayList(var1));
   }

   public Optional<E> N(class06069 var1) {
      if (this.u == null) {
         return Optional.empty();
      } else {
         int i = var1.y(this.y);
         return Optional.of(this.u.N(i));
      }
   }

   @SafeVarargs
   public static <E> class04540<E> N(class04523<E>... var0) {
      return new class04540<>(List.of(var0));
   }

   public static <E> Codec<class04540<E>> N(Codec<E> var0) {
      return class04523.N(var0).listOf().xmap(class04540::N, class04540::u);
   }

   public static <E> Codec<class04540<E>> N(MapCodec<E> var0) {
      return class04523.N(var0).listOf().xmap(class04540::N, class04540::u);
   }

   public <T> class04540<T> N(Function<E, T> var1) {
      return new class04540(Lists.transform(this.L, var1x -> var1x.N(var1)));
   }

   public static <E> class04540<E> N(List<class04523<E>> var0) {
      return new class04540<>(var0);
   }
}

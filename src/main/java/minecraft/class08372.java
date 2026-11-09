package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class class08372<StoredEntityType extends class08636> {
   private static final Codec<? extends class08372<?>> N = class01487.N.xmap(class08372::new, class08372::L);
   private static final class02362<ByteBuf, ? extends class08372<?>> y = class01487.M.N_10(class08372::new, class08372::L);
   private Either<UUID, StoredEntityType> L;

   public UUID L() {
      return (UUID)this.L.map(var0 -> var0, class08636::method_5667);
   }

   @Nullable
   public static class08036 L(@Nullable class08372<class08036> var0, class07299 var1) {
      return N(var0, var1, class08036.class);
   }

   private class08372(UUID var1) {
      super();
      this.L = Either.left(var1);
   }

   private class08372(StoredEntityType var1) {
      super();
      this.L = Either.right(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this ? true : var1 instanceof class08372 class08372 && this.L().equals(class08372.L());
   }

   @Override
   public int hashCode() {
      return this.L().hashCode();
   }

   public boolean y(StoredEntityType var1) {
      return this.L().equals(var1.method_5667());
   }

   public static <Type extends class08636> class02362<ByteBuf, class08372<Type>> y() {
      return (class02362<ByteBuf, class08372<Type>>)y;
   }

   @Nullable
   public static class07438 y(@Nullable class08372<class07438> var0, class07299 var1) {
      return N(var0, var1, class07438.class);
   }

   @Nullable
   public static <StoredEntityType extends class08636> class08372<StoredEntityType> N(class08299 var0, String var1) {
      return var0.<class08372<StoredEntityType>>N(var1, N()).orElse(null);
   }

   @Nullable
   public static <StoredEntityType extends class08636> class08372<StoredEntityType> N(class08299 var0, String var1, class07299 var2) {
      Optional<UUID> optional = var0.N(var1, class01487.N);
      return optional.isPresent() ? N(optional.get()) : var0.M(var1).map(var1x -> class01067.N(var2.method_8503(), var1x)).map(class08372::new).orElse(null);
   }

   public static <Type extends class08636> Codec<class08372<Type>> N() {
      return (Codec<class08372<Type>>)N;
   }

   @Nullable
   private StoredEntityType N(@Nullable class08636 var1, Class<StoredEntityType> var2) {
      return (StoredEntityType)(var1 != null && var2.isAssignableFrom(var1.getClass()) ? var2.cast(var1) : null);
   }

   @Nullable
   public StoredEntityType N(class07299 var1, Class<StoredEntityType> var2) {
      return class08036.class.isAssignableFrom(var2) ? this.N(var1::method_73285, var2) : this.N(var1::method_73284, var2);
   }

   @Nullable
   public StoredEntityType N(class08607<? extends class08636> var1, Class<StoredEntityType> var2) {
      Optional optional = this.L.right();
      if (optional.isPresent()) {
         class08636 class08636x = (class08636)optional.get();
         if (!class08636x.method_31481()) {
            return (StoredEntityType)class08636x;
         }

         this.L = Either.left(class08636x.method_5667());
      }

      Optional optional1 = this.L.left();
      if (optional1.isPresent()) {
         class08636 class08636 = this.N(var1.lookup((UUID)optional1.get()), var2);
         if (class08636 != null && !class08636.method_31481()) {
            this.L = Either.right(class08636);
            return (StoredEntityType)class08636;
         }
      }

      return null;
   }

   public static <T extends class08636> class08372<T> N(UUID var0) {
      return new class08372<>(var0);
   }

   @Nullable
   public static <T extends class08636> class08372<T> N(@Nullable T var0) {
      return var0 != null ? new class08372<>((T)var0) : null;
   }

   @Nullable
   public static class07049 N(@Nullable class08372<class07049> var0, class07299 var1) {
      return N(var0, var1, class07049.class);
   }

   @Nullable
   public static <StoredEntityType extends class08636> StoredEntityType N(
      @Nullable class08372<StoredEntityType> var0, class07299 var1, Class<StoredEntityType> var2
   ) {
      return (StoredEntityType)(var0 != null ? var0.N(var1, var2) : null);
   }

   public static void N(@Nullable class08372<?> var0, class08329 var1, String var2) {
      if (var0 != null) {
         var0.N(var1, var2);
      }
   }

   public void N(class08329 var1, String var2) {
      var1.N(var2, class01487.N, this.L());
   }
}

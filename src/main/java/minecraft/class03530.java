package minecraft;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import net.fabricmc.fabric.api.tag.FabricTagKey;
import net.fabricmc.fabric.mixin.tag.convention.TagKeyMixin;

public record class03530<T>(class05946<? extends class00751<T>> registry, class01894 location) implements FabricTagKey, TagKeyMixin {
   private static final Interner<class03530<?>> L = Interners.newWeakInterner();

   public static <T> class02362<ByteBuf, class03530<T>> L(class05946<? extends class00751<T>> var0) {
      return class01894.y.N_10(var1 -> N(var0, var1), class03530::y);
   }

   @Deprecated
   public class03530(class05946<? extends class00751<T>> registry, class01894 location) {
      this.registry = registry;
      this.location = location;
   }

   @Override
   public String toString() {
      return "TagKey[" + this.registry.N() + " / " + this.location + "]";
   }

   public <E> Optional<class03530<E>> i(class05946<? extends class00751<E>> var1) {
      return this.u(var1) ? Optional.of((class03530<E>)this) : Optional.empty();
   }

   public boolean u(class05946<? extends class00751<?>> var1) {
      return this.registry == var1;
   }

   public static <T> Codec<class03530<T>> y(class05946<? extends class00751<T>> var0) {
      return Codec.STRING
         .comapFlatMap(
            var1 -> var1.startsWith("#") ? class01894.u(var1.substring(1)).map(var1x -> N(var0, var1x)) : DataResult.error(() -> "Not a tag id"),
            var0x -> "#" + var0x.location
         );
   }

   public class01894 y() {
      return this.location;
   }

   public static <T> Codec<class03530<T>> N(class05946<? extends class00751<T>> var0) {
      return class01894.N.xmap(var1 -> N(var0, var1), class03530::y);
   }

   public static <T> class03530<T> N(class05946<? extends class00751<T>> var0, class01894 var1) {
      return (class03530<T>)L.intern(new class03530(var0, var1));
   }

   public class05946<? extends class00751<T>> N() {
      return this.registry;
   }
}

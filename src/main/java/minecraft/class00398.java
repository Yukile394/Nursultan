package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class00398 {
   public static final MapCodec<class00398> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class04206.M.T().fieldOf("id").forGetter(var0x -> var0x.y),
            class01487.R.fieldOf("uuid").forGetter(var0x -> var0x.L),
            class03748.N.optionalFieldOf("name").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class00398::new)
   );
   public final class07078<?> y;
   public final UUID L;
   public final Optional<class00392> u;
   @Nullable
   private List<class00392> i;

   public class00398(class07078<?> var1, UUID var2, @Nullable class00392 var3) {
      this(var1, var2, Optional.ofNullable(var3));
   }

   public class00398(class07078<?> var1, UUID var2, Optional<class00392> var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class00398 class00398 = (class00398)var1;
         return this.y.equals(class00398.y) && this.L.equals(class00398.L) && this.u.equals(class00398.u);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int ix = this.y.hashCode();
      ix = 31 * ix + this.L.hashCode();
      return 31 * ix + this.u.hashCode();
   }

   public List<class00392> N() {
      if (this.i == null) {
         this.i = new ArrayList<>();
         this.u.ifPresent(this.i::add);
         this.i.add(class00392.N("gui.entity_tooltip.type", this.y.M()));
         this.i.add(class00392.y(this.L.toString()));
      }

      return this.i;
   }
}

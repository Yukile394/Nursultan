package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00798(class00816 dealtDamage, class00816 takenDamage, Optional<class00821> sourceEntity, Optional<Boolean> blocked, Optional<class00759> type) {
   public static final Codec<class00798> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00816.u.optionalFieldOf("dealt", class00816.L).forGetter(class00798::N),
            class00816.u.optionalFieldOf("taken", class00816.L).forGetter(class00798::y),
            class00821.N.optionalFieldOf("source_entity").forGetter(class00798::L),
            Codec.BOOL.optionalFieldOf("blocked").forGetter(class00798::u),
            class00759.N.optionalFieldOf("type").forGetter(class00798::i)
         )
         .apply(var0, class00798::new)
   );

   public Optional<class00821> L() {
      return this.sourceEntity;
   }

   public class00798(class00816 dealtDamage, class00816 takenDamage, Optional<class00821> sourceEntity, Optional<Boolean> blocked, Optional<class00759> type) {
      this.dealtDamage = dealtDamage;
      this.takenDamage = takenDamage;
      this.sourceEntity = sourceEntity;
      this.blocked = blocked;
      this.type = type;
   }

   public Optional<class00759> i() {
      return this.type;
   }

   public Optional<Boolean> u() {
      return this.blocked;
   }

   public class00816 y() {
      return this.takenDamage;
   }

   public boolean N(class04770 var1, class07072 var2, float var3, float var4, boolean var5) {
      if (!this.dealtDamage.u(var3)) {
         return false;
      } else if (!this.takenDamage.u(var4)) {
         return false;
      } else if (this.sourceEntity.isPresent() && !this.sourceEntity.get().N(var1, var2.u())) {
         return false;
      } else {
         return this.blocked.isPresent() && this.blocked.get() != var5 ? false : !this.type.isPresent() || this.type.get().N(var1, var2);
      }
   }

   public class00816 N() {
      return this.dealtDamage;
   }
}

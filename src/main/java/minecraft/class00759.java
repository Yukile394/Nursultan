package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public record class00759(List<class03659<class03689>> tags, Optional<class00821> directEntity, Optional<class00821> sourceEntity, Optional<Boolean> isDirect) {
   public static final Codec<class00759> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03659.N(class04227.yN).listOf().optionalFieldOf("tags", List.of()).forGetter(class00759::N),
            class00821.N.optionalFieldOf("direct_entity").forGetter(class00759::y),
            class00821.N.optionalFieldOf("source_entity").forGetter(class00759::L),
            Codec.BOOL.optionalFieldOf("is_direct").forGetter(class00759::u)
         )
         .apply(var0, class00759::new)
   );

   public Optional<class00821> L() {
      return this.sourceEntity;
   }

   public class00759(List<class03659<class03689>> tags, Optional<class00821> directEntity, Optional<class00821> sourceEntity, Optional<Boolean> isDirect) {
      this.tags = tags;
      this.directEntity = directEntity;
      this.sourceEntity = sourceEntity;
      this.isDirect = isDirect;
   }

   public Optional<Boolean> u() {
      return this.isDirect;
   }

   public Optional<class00821> y() {
      return this.directEntity;
   }

   public List<class03659<class03689>> N() {
      return this.tags;
   }

   public boolean N(class04782 var1, class06889 var2, class07072 var3) {
      Iterator iterator = this.tags.iterator();

      while (iterator.hasNext()) {
         if (!((class03659)iterator.next()).N(var3.E())) {
            return false;
         }
      }

      if (this.directEntity.isPresent() && !this.directEntity.get().N(var1, var2, var3.L())) {
         return false;
      } else {
         return this.sourceEntity.isPresent() && !this.sourceEntity.get().N(var1, var2, var3.u())
            ? false
            : !this.isDirect.isPresent() || this.isDirect.get() == var3.y();
      }
   }

   public boolean N(class04770 var1, class07072 var2) {
      return this.N(var1.method_51469(), var1.method_73189(), var2);
   }
}

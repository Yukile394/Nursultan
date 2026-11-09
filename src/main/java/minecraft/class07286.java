package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class07286(
   class03543<class06581> supportedItems,
   Optional<class03543<class06581>> primaryItems,
   int weight,
   int maxLevel,
   class07300 minCost,
   class07300 maxCost,
   int anvilCost,
   List<class02834> slots
) {
   public static final MapCodec<class07286> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03541.N(class04227.F).fieldOf("supported_items").forGetter(class07286::N),
            class03541.N(class04227.F).optionalFieldOf("primary_items").forGetter(class07286::y),
            class06338.N(1, 1024).fieldOf("weight").forGetter(class07286::L),
            class06338.N(1, 255).fieldOf("max_level").forGetter(class07286::u),
            class07300.N.fieldOf("min_cost").forGetter(class07286::i),
            class07300.N.fieldOf("max_cost").forGetter(class07286::R),
            class06338.T.fieldOf("anvil_cost").forGetter(class07286::M),
            class02834.field_49226.listOf().fieldOf("slots").forGetter(class07286::B)
         )
         .apply(var0, class07286::new)
   );

   public int L() {
      return this.weight;
   }

   public int M() {
      return this.anvilCost;
   }

   public class07286(
      class03543<class06581> supportedItems,
      Optional<class03543<class06581>> primaryItems,
      int weight,
      int maxLevel,
      class07300 minCost,
      class07300 maxCost,
      int anvilCost,
      List<class02834> slots
   ) {
      super();
      this.supportedItems = supportedItems;
      this.primaryItems = primaryItems;
      this.weight = weight;
      this.maxLevel = maxLevel;
      this.minCost = minCost;
      this.maxCost = maxCost;
      this.anvilCost = anvilCost;
      this.slots = slots;
   }

   public List<class02834> B() {
      return this.slots;
   }

   public class07300 i() {
      return this.minCost;
   }

   public int u() {
      return this.maxLevel;
   }

   public Optional<class03543<class06581>> y() {
      return this.primaryItems;
   }

   public class03543<class06581> N() {
      return this.supportedItems;
   }

   public class07300 R() {
      return this.maxCost;
   }
}

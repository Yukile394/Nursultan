package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record class08562(boolean hideTooltip, SequencedSet<class02477<?>> hiddenComponents) {
   private static final Codec<SequencedSet<class02477<?>>> R = class02477.N.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<class08562> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(class08562::N),
            R.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(class08562::y)
         )
         .apply(var0, class08562::new)
   );
   public static final class02362<class04247, class08562> y = class02362.N(
      class02389.y, class08562::N, class02477.y.N_33(class02389.N(ReferenceLinkedOpenHashSet::new)), class08562::y, class08562::new
   );
   public static final class08562 L = new class08562(false, ReferenceSortedSets.emptySet());

   public class08562(boolean hideTooltip, SequencedSet<class02477<?>> hiddenComponents) {
      super();
      this.hideTooltip = hideTooltip;
      this.hiddenComponents = hiddenComponents;
   }

   public SequencedSet<class02477<?>> y() {
      return this.hiddenComponents;
   }

   public boolean N(class02477<?> var1) {
      return !this.hideTooltip && !this.hiddenComponents.contains(var1);
   }

   public boolean N() {
      return this.hideTooltip;
   }

   public class08562 N(class02477<?> var1, boolean var2) {
      if (this.hiddenComponents.contains(var1) == var2) {
         return this;
      } else {
         ReferenceLinkedOpenHashSet referencelinkedopenhashset = new ReferenceLinkedOpenHashSet(this.hiddenComponents);
         if (var2) {
            referencelinkedopenhashset.add(var1);
         } else {
            referencelinkedopenhashset.remove(var1);
         }

         return new class08562(this.hideTooltip, referencelinkedopenhashset);
      }
   }
}

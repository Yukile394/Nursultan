package minecraft;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00480(class02265 mapId, byte scale, boolean locked, Optional<List<class00768>> decorations, Optional<class07790> colorPatch)
   implements class00381<class07280> {
   public static final class02362<class04247, class00480> N = class02362.N(
      class02265.y,
      class00480::N,
      class02389.L,
      class00480::y,
      class02389.y,
      class00480::L,
      class00768.N.N_33(class02389.N()).N_33(class02389::N),
      class00480::u,
      class07790.N,
      class00480::M,
      class00480::new
   );

   public boolean L() {
      return this.locked;
   }

   public Optional<class07790> M() {
      return this.colorPatch;
   }

   public class00480(class02265 var1, byte var2, boolean var3, @Nullable Collection<class00768> var4, @Nullable class07790 var5) {
      this(var1, var2, var3, var4 != null ? Optional.of(List.copyOf(var4)) : Optional.empty(), Optional.ofNullable(var5));
   }

   public class00480(class02265 mapId, byte scale, boolean locked, Optional<List<class00768>> decorations, Optional<class07790> colorPatch) {
      super();
      this.mapId = mapId;
      this.scale = scale;
      this.locked = locked;
      this.decorations = decorations;
      this.colorPatch = colorPatch;
   }

   public Optional<List<class00768>> u() {
      return this.decorations;
   }

   public byte y() {
      return this.scale;
   }

   public class02265 N() {
      return this.mapId;
   }

   public void N(class07769 var1) {
      this.decorations.ifPresent(var1::N);
      this.colorPatch.ifPresent(var1x -> var1x.N(var1));
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00480> method_65080() {
      return class04248.C;
   }
}

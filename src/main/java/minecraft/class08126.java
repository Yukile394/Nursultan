package minecraft;

import java.util.Set;

public record class08126(class01894 textureId, class01894 definitionLocation, boolean createMipmaps, Set<class02968<?>> additionalMetadata) {

   public boolean L() {
      return this.createMipmaps;
   }

   public class08126(class01894 var1, class01894 var2, boolean var3) {
      this(var1, var2, var3, Set.of());
   }

   public class08126(class01894 textureId, class01894 definitionLocation, boolean createMipmaps, Set<class02968<?>> additionalMetadata) {
      super();
      this.textureId = textureId;
      this.definitionLocation = definitionLocation;
      this.createMipmaps = createMipmaps;
      this.additionalMetadata = additionalMetadata;
   }

   public Set<class02968<?>> u() {
      return this.additionalMetadata;
   }

   public class01894 y() {
      return this.definitionLocation;
   }

   public class01894 N() {
      return this.textureId;
   }
}

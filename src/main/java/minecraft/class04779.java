package minecraft;

import java.nio.file.Path;
import java.time.ZonedDateTime;

public record class04779(Path path) {

   public Path L() {
      return this.N(class05071.R);
   }

   public class04779(Path path) {
      this.path = path;
   }

   public Path i() {
      return this.N(class05071.B);
   }

   public Path u() {
      return this.N(class05071.M);
   }

   public Path y() {
      return this.N(class05071.i);
   }

   public Path y(ZonedDateTime var1) {
      return this.path.resolve(class05071.i.N() + "_raw_" + var1.format(class03804.N));
   }

   public String N() {
      return this.path.getFileName().toString();
   }

   public Path N(class05071 var1) {
      return this.path.resolve(var1.N());
   }

   public Path N(ZonedDateTime var1) {
      return this.path.resolve(class05071.i.N() + "_corrupted_" + var1.format(class03804.N));
   }

   public Path R() {
      return this.path;
   }
}

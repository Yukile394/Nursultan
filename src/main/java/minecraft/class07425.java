package minecraft;

import java.net.URI;
import java.util.List;

public record class07425<T>(String name, URI ref, class07389<T> schema) {
   public String L() {
      return this.name;
   }

   public class07425(String name, URI ref, class07389<T> schema) {
      super();
      this.name = name;
      this.ref = ref;
      this.schema = schema;
   }

   public class07389<T> i() {
      return this.schema;
   }

   public URI u() {
      return this.ref;
   }

   public class07389<List<T>> y() {
      return class07389.N(this.N(), this.schema.z());
   }

   public class07389<T> N() {
      return class07389.N(this.ref, this.schema.z());
   }
}

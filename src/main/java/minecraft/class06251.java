package minecraft;

public record class06251(class06262 provider, class02263 filter) implements AutoCloseable {
   public class06251(class06262 provider, class02263 filter) {
      this.provider = provider;
      this.filter = filter;
   }

   @Override
   public void close() {
      this.provider.close();
   }

   public class02263 y() {
      return this.filter;
   }

   public class06262 N() {
      return this.provider;
   }
}

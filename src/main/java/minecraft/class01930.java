package minecraft;

public record class01930(class01089 resources, class03776 dataConfiguration, class01929 datapackWorldgen, class01022 datapackDimensions) {
   public class01929 L() {
      return this.datapackWorldgen;
   }

   public class01930(class01089 resources, class03776 dataConfiguration, class01929 datapackWorldgen, class01022 datapackDimensions) {
      super();
      this.resources = resources;
      this.dataConfiguration = dataConfiguration;
      this.datapackWorldgen = datapackWorldgen;
      this.datapackDimensions = datapackDimensions;
   }

   public class01022 u() {
      return this.datapackDimensions;
   }

   public class03776 y() {
      return this.dataConfiguration;
   }

   public class01089 N() {
      return this.resources;
   }
}

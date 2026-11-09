package minecraft;

import org.jspecify.annotations.Nullable;

public enum class00082 {
   field_60176("AustraliaEast", "realms.configuration.region.australia_east"),
   field_60177("AustraliaSoutheast", "realms.configuration.region.australia_southeast"),
   field_60178("BrazilSouth", "realms.configuration.region.brazil_south"),
   field_60179("CentralIndia", "realms.configuration.region.central_india"),
   field_60180("CentralUs", "realms.configuration.region.central_us"),
   field_60181("EastAsia", "realms.configuration.region.east_asia"),
   field_60182("EastUs", "realms.configuration.region.east_us"),
   field_60183("EastUs2", "realms.configuration.region.east_us_2"),
   field_60184("FranceCentral", "realms.configuration.region.france_central"),
   field_60185("JapanEast", "realms.configuration.region.japan_east"),
   field_60186("JapanWest", "realms.configuration.region.japan_west"),
   field_60187("KoreaCentral", "realms.configuration.region.korea_central"),
   field_60188("NorthCentralUs", "realms.configuration.region.north_central_us"),
   field_60189("NorthEurope", "realms.configuration.region.north_europe"),
   field_60190("SouthCentralUs", "realms.configuration.region.south_central_us"),
   field_60191("SoutheastAsia", "realms.configuration.region.southeast_asia"),
   field_60192("SwedenCentral", "realms.configuration.region.sweden_central"),
   field_60193("UAENorth", "realms.configuration.region.uae_north"),
   field_60194("UKSouth", "realms.configuration.region.uk_south"),
   field_60195("WestCentralUs", "realms.configuration.region.west_central_us"),
   field_60196("WestEurope", "realms.configuration.region.west_europe"),
   field_60197("WestUs", "realms.configuration.region.west_us"),
   field_60198("WestUs2", "realms.configuration.region.west_us_2"),
   field_60199("invalid", "");

   public final String field_60200;
   public final String field_60201;

   private class00082(String var3, String var4) {
      this.field_60200 = var3;
      this.field_60201 = var4;
   }

   @Nullable
   public static class00082 N(String var0) {
      for (class00082 class00082 : values()) {
         if (class00082.field_60200.equals(var0)) {
            return class00082;
         }
      }

      return null;
   }
}

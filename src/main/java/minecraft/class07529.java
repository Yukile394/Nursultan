package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import java.time.Duration;
import org.jspecify.annotations.Nullable;

public class class07529 {
   @Deprecated
   public static final boolean N = false;
   @Deprecated
   public static final int y = 4671;
   @Deprecated
   public static final String L = "main";
   @Deprecated
   public static final int u = 774;
   @Deprecated
   public static final int i = 286;
   public static final int R = 4650;
   private static final int yT = 30;
   public static final boolean M = false;
   @Deprecated
   public static final int B = 75;
   @Deprecated
   public static final int Z = 0;
   @Deprecated
   public static final int z = 94;
   @Deprecated
   public static final int U = 1;
   public static final String E = "2.0.0";
   @Deprecated
   public static final int W = 1;
   public static final int m = 1;
   public static final String P = "DataVersion";
   public static final String s = "MC_DEBUG_";
   public static final boolean T = y(N("ENABLED"));
   private static final boolean yb = y(N("PRINT_PROPERTIES"));
   public static final boolean b = false;
   public static final boolean j = false;
   public static final boolean v = L("OPEN_INCOMPATIBLE_WORLDS");
   public static final boolean n = L("ALLOW_LOW_SIM_DISTANCE");
   public static final boolean t = L("HOTKEYS");
   public static final boolean G = L("UI_NARRATION");
   public static final boolean l = L("SHUFFLE_UI_RENDERING_ORDER");
   public static final boolean d = L("SHUFFLE_MODELS");
   public static final boolean w = L("RENDER_UI_LAYERING_RECTANGLES");
   public static final boolean k = L("PATHFINDING");
   public static final boolean Y = L("SHOW_LOCAL_SERVER_ENTITY_HIT_BOXES");
   public static final boolean Q = L("SHAPES");
   public static final boolean O = L("NEIGHBORSUPDATE");
   public static final boolean g = L("EXPERIMENTAL_REDSTONEWIRE_UPDATE_ORDER");
   public static final boolean I = L("STRUCTURES");
   public static final boolean J = L("GAME_EVENT_LISTENERS");
   public static final boolean o = L("DUMP_TEXTURE_ATLAS");
   public static final boolean q = L("DUMP_INTERPOLATED_TEXTURE_FRAMES");
   public static final boolean K = L("STRUCTURE_EDIT_MODE");
   public static final boolean V = L("SAVE_STRUCTURES_AS_SNBT");
   public static final boolean e = L("SYNCHRONOUS_GL_LOGS");
   public static final boolean H = L("VERBOSE_SERVER_EVENTS");
   public static final boolean c = L("NAMED_RUNNABLES");
   public static final boolean X = L("GOAL_SELECTOR");
   public static final boolean a = L("VILLAGE_SECTIONS");
   public static final boolean p = L("BRAIN");
   public static final boolean F = L("POI");
   public static final boolean A = L("BEES");
   public static final boolean f = L("RAIDS");
   public static final boolean C = L("BLOCK_BREAK");
   public static final boolean S = L("MONITOR_TICK_TIMES");
   public static final boolean x = L("KEEP_JIGSAW_BLOCKS_DURING_STRUCTURE_GEN");
   public static final boolean D = L("DONT_SAVE_WORLD");
   public static final boolean h = L("LARGE_DRIPSTONE");
   public static final boolean r = L("CARVERS");
   public static final boolean NN = L("ORE_VEINS");
   public static final boolean Ny = L("SCULK_CATALYST");
   public static final boolean NL = L("BYPASS_REALMS_VERSION_CHECK");
   public static final boolean Nu = L("SOCIAL_INTERACTIONS");
   public static final boolean Ni = L("VALIDATE_RESOURCE_PATH_CASE");
   public static final boolean NR = L("UNLOCK_ALL_TRADES");
   public static final boolean NM = L("BREEZE_MOB");
   public static final boolean NB = L("TRIAL_SPAWNER_DETECTS_SHEEP_AS_PLAYERS");
   public static final boolean NZ = L("VAULT_DETECTS_SHEEP_AS_PLAYERS");
   public static final boolean Nz = L("FORCE_ONBOARDING_SCREEN");
   public static final boolean NU = L("CURSOR_POS");
   public static final boolean NE = L("DEFAULT_SKIN_OVERRIDE");
   public static final boolean NW = L("PANORAMA_SCREENSHOT");
   public static final boolean Nm = L("CHASE_COMMAND");
   public static final boolean NP = L("VERBOSE_COMMAND_ERRORS");
   public static final boolean Ns = L("DEV_COMMANDS");
   public static final boolean NT = L("ACTIVE_TEXT_AREAS");
   public static final boolean Nb = L("IGNORE_LOCAL_MOB_CAP");
   public static final boolean Nj = L("DISABLE_LIQUID_SPREADING");
   public static final boolean Nv = L("AQUIFERS");
   public static final boolean Nn = L("JFR_PROFILING_ENABLE_LEVEL_LOADING");
   public static final boolean Nt = L("ENTITY_BLOCK_INTERSECTION");
   public static boolean NG = L("GENERATE_SQUARE_TERRAIN_WITHOUT_NOISE");
   public static final boolean Nl = L("ONLY_GENERATE_HALF_THE_WORLD");
   public static final boolean Nd = L("DISABLE_FLUID_GENERATION");
   public static final boolean Nw = L("DISABLE_AQUIFERS");
   public static final boolean Nk = L("DISABLE_SURFACE");
   public static final boolean NY = L("DISABLE_CARVERS");
   public static final boolean NQ = L("DISABLE_STRUCTURES");
   public static final boolean NO = L("DISABLE_FEATURES");
   public static final boolean Ng = L("DISABLE_ORE_VEINS");
   public static final boolean NI = L("DISABLE_BLENDING");
   public static final boolean NJ = L("DISABLE_BELOW_ZERO_RETROGENERATION");
   public static final int No = 25565;
   public static final boolean Nq = L("SUBTITLES");
   public static final int NK = u("FAKE_LATENCY_MS");
   public static final int NV = u("FAKE_JITTER_MS");
   public static final Level Ne = Level.DISABLED;
   public static final boolean NH = L("COMMAND_STACK_TRACES");
   public static final boolean Nc = L("WORLD_RECREATE");
   public static final boolean NX = L("SHOW_SERVER_DEBUG_VALUES");
   public static final boolean Na = L("FEATURE_COUNT");
   public static final boolean Np = L("FORCE_TELEMETRY");
   public static final boolean NF = L("DONT_SEND_TELEMETRY_TO_BACKEND");
   public static final long NA = Duration.ofMillis(300L).toNanos();
   public static final float Nf = 3600000.0F;
   public static final boolean NC = false;
   public static final boolean NS = false;
   public static boolean Nx = true;
   public static boolean ND;
   public static final int Nh = 16;
   public static final int Nr = 256;
   public static final int yN = 32500;
   public static final int yy = 2000000;
   public static final int yL = 16;
   public static final int yu = 1000000;
   public static final int yi = 32;
   public static final int yR = 128;
   public static final char[] yM = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   public static final int yB = 20;
   public static final int yZ = 50;
   public static final int yz = 1200;
   public static final int yU = 24000;
   public static final int yE = 3;
   public static final float yW = 1365.3334F;
   public static final float ym = 0.87890625F;
   public static final float yP = 17.578125F;
   public static final int ys = 64;
   @Nullable
   private static class04551 yj;

   private static boolean L(String var0) {
      if (!T) {
         return false;
      } else {
         String sx = N(var0);
         if (yb) {
            System.out.println("Debug property available: " + sx + ": bool");
         }

         return y(sx);
      }
   }

   public static int L() {
      return 774;
   }

   public class07529() {
      super();
   }

   private static int u(String var0) {
      if (!T) {
         return 0;
      } else {
         String sx = N(var0);
         if (yb) {
            System.out.println("Debug property available: " + sx + ": int");
         }

         return Integer.parseInt(System.getProperty(sx, "0"));
      }
   }

   public static class04551 y() {
      if (yj == null) {
         throw new IllegalStateException("Game version not set");
      } else {
         return yj;
      }
   }

   private static boolean y(String var0) {
      String sx = System.getProperty(var0);
      return sx != null && (sx.isEmpty() || Boolean.parseBoolean(sx));
   }

   public static void N(class04551 var0) {
      if (yj == null) {
         yj = var0;
      } else if (var0 != yj) {
         throw new IllegalStateException("Cannot override the current game version!");
      }
   }

   public static boolean N(class07321 var0) {
      int ix = var0.i();
      int jx = var0.R();
      if (Nl) {
         return jx < 0;
      } else {
         return !NG ? false : ix > 8192 || ix < 0 || jx > 1024 || jx < 0;
      }
   }

   private static String N(String var0) {
      return "MC_DEBUG_" + var0;
   }

   public static void N() {
      if (yj == null) {
         yj = class05257.N();
      }
   }

   static {
      ResourceLeakDetector.setLevel(Ne);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = NH;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new class07676();
   }
}

package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class class05803 {
   private static final Dynamic<?>[] y = new Dynamic[4096];
   private static final Dynamic<?>[] L = new Dynamic[256];
   private static final Object2IntMap<Dynamic<?>> u = (Object2IntMap<Dynamic<?>>)DataFixUtils.make(
      new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1)
   );
   private static final Object2IntMap<String> i = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
   static final String N = "%%FILTER_ME%%";
   private static final String R = "Name";
   private static final String M = "Properties";
   private static final Map<String, String> B = Map.of("age", "0");
   private static final Map<String, String> Z = Map.of("age", "0", "facing", "east");
   private static final Map<String, String> z = Map.of("age", "0", "facing", "north");
   private static final Map<String, String> U = Map.of("age", "0", "facing", "south");
   private static final Map<String, String> E = Map.of("age", "0", "facing", "west");
   private static final Map<String, String> W = Map.of("age", "1");
   private static final Map<String, String> m = Map.of("age", "10");
   private static final Map<String, String> P = Map.of("age", "11");
   private static final Map<String, String> s = Map.of("age", "12");
   private static final Map<String, String> T = Map.of("age", "13");
   private static final Map<String, String> b = Map.of("age", "14");
   private static final Map<String, String> j = Map.of("age", "15");
   private static final Map<String, String> v = Map.of("age", "1", "facing", "east");
   private static final Map<String, String> n = Map.of("age", "1", "facing", "north");
   private static final Map<String, String> t = Map.of("age", "1", "facing", "south");
   private static final Map<String, String> G = Map.of("age", "1", "facing", "west");
   private static final Map<String, String> l = Map.of("age", "2");
   private static final Map<String, String> d = Map.of("age", "2", "facing", "east");
   private static final Map<String, String> w = Map.of("age", "2", "facing", "north");
   private static final Map<String, String> k = Map.of("age", "2", "facing", "south");
   private static final Map<String, String> Y = Map.of("age", "2", "facing", "west");
   private static final Map<String, String> Q = Map.of("age", "3");
   private static final Map<String, String> O = Map.of("age", "4");
   private static final Map<String, String> g = Map.of("age", "5");
   private static final Map<String, String> I = Map.of("age", "6");
   private static final Map<String, String> J = Map.of("age", "7");
   private static final Map<String, String> o = Map.of("age", "8");
   private static final Map<String, String> q = Map.of("age", "9");
   private static final Map<String, String> K = Map.of("axis", "x");
   private static final Map<String, String> V = Map.of("axis", "y");
   private static final Map<String, String> e = Map.of("axis", "z");
   private static final Map<String, String> H = Map.of("check_decay", "false", "decayable", "false");
   private static final Map<String, String> c = Map.of("check_decay", "false", "decayable", "true");
   private static final Map<String, String> X = Map.of("check_decay", "true", "decayable", "false");
   private static final Map<String, String> a = Map.of("check_decay", "true", "decayable", "true");
   private static final Map<String, String> p = Map.of("color", "black");
   private static final Map<String, String> F = Map.of("color", "blue");
   private static final Map<String, String> A = Map.of("color", "brown");
   private static final Map<String, String> f = Map.of("color", "cyan");
   private static final Map<String, String> C = Map.of("color", "gray");
   private static final Map<String, String> S = Map.of("color", "green");
   private static final Map<String, String> x = Map.of("color", "light_blue");
   private static final Map<String, String> D = Map.of("color", "lime");
   private static final Map<String, String> h = Map.of("color", "magenta");
   private static final Map<String, String> r = Map.of("color", "orange");
   private static final Map<String, String> NN = Map.of("color", "pink");
   private static final Map<String, String> Ny = Map.of("color", "purple");
   private static final Map<String, String> NL = Map.of("color", "red");
   private static final Map<String, String> Nu = Map.of("color", "silver");
   private static final Map<String, String> Ni = Map.of("color", "white");
   private static final Map<String, String> NR = Map.of("color", "yellow");
   private static final Map<String, String> NM = Map.of(
      "attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> NB = Map.of(
      "attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false"
   );
   private static final Map<String, String> NZ = Map.of(
      "attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> Nz = Map.of(
      "attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false"
   );
   private static final Map<String, String> NU = Map.of(
      "attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> NE = Map.of(
      "attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false"
   );
   private static final Map<String, String> NW = Map.of(
      "attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> Nm = Map.of("face", "ceiling", "facing", "north", "powered", "false");
   private static final Map<String, String> NP = Map.of("face", "ceiling", "facing", "north", "powered", "true");
   private static final Map<String, String> Ns = Map.of("face", "floor", "facing", "north", "powered", "false");
   private static final Map<String, String> NT = Map.of("face", "floor", "facing", "north", "powered", "true");
   private static final Map<String, String> Nb = Map.of("face", "wall", "facing", "east", "powered", "false");
   private static final Map<String, String> Nj = Map.of("face", "wall", "facing", "north", "powered", "false");
   private static final Map<String, String> Nv = Map.of("face", "wall", "facing", "south", "powered", "false");
   private static final Map<String, String> Nn = Map.of("face", "wall", "facing", "west", "powered", "false");
   private static final Map<String, String> Nt = Map.of("face", "wall", "facing", "east", "powered", "true");
   private static final Map<String, String> NG = Map.of("face", "wall", "facing", "north", "powered", "true");
   private static final Map<String, String> Nl = Map.of("face", "wall", "facing", "south", "powered", "true");
   private static final Map<String, String> Nd = Map.of("face", "wall", "facing", "west", "powered", "true");
   private static final Map<String, String> Nw = Map.of("facing", "down");
   private static final Map<String, String> Nk = Map.of("conditional", "false", "facing", "down");
   private static final Map<String, String> NY = Map.of("conditional", "true", "facing", "down");
   private static final Map<String, String> NQ = Map.of("extended", "false", "facing", "down");
   private static final Map<String, String> NO = Map.of("extended", "true", "facing", "down");
   private static final Map<String, String> Ng = Map.of("facing", "down", "powered", "false");
   private static final Map<String, String> NI = Map.of("facing", "down", "powered", "true");
   private static final Map<String, String> NJ = Map.of("facing", "east");
   private static final Map<String, String> No = Map.of("conditional", "false", "facing", "east");
   private static final Map<String, String> Nq = Map.of("conditional", "true", "facing", "east");
   private static final Map<String, String> NK = Map.of("extended", "false", "facing", "east");
   private static final Map<String, String> NV = Map.of("extended", "true", "facing", "east");
   private static final Map<String, String> Ne = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> NH = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> Nc = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> NX = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> Na = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> Np = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> NF = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> NA = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> Nf = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> NC = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> NS = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> Nx = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> ND = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> Nh = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> Nr = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> yN = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> yy = Map.of("facing", "east", "powered", "false");
   private static final Map<String, String> yL = Map.of("facing", "east", "powered", "true");
   private static final Map<String, String> yu = Map.of("facing", "north");
   private static final Map<String, String> yi = Map.of("conditional", "false", "facing", "north");
   private static final Map<String, String> yR = Map.of("conditional", "true", "facing", "north");
   private static final Map<String, String> yM = Map.of("extended", "false", "facing", "north");
   private static final Map<String, String> yB = Map.of("extended", "true", "facing", "north");
   private static final Map<String, String> yZ = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> yz = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> yU = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> yE = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> yW = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> ym = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> yP = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> ys = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> yT = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> yb = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> yj = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> yv = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> yn = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> yt = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> yG = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> yl = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> yd = Map.of("facing", "north", "powered", "false");
   private static final Map<String, String> yw = Map.of("facing", "north", "powered", "true");
   private static final Map<String, String> yk = Map.of("facing", "south");
   private static final Map<String, String> yY = Map.of("conditional", "false", "facing", "south");
   private static final Map<String, String> yQ = Map.of("conditional", "true", "facing", "south");
   private static final Map<String, String> yO = Map.of("extended", "false", "facing", "south");
   private static final Map<String, String> yg = Map.of("extended", "true", "facing", "south");
   private static final Map<String, String> yI = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> yJ = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> yo = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> yq = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> yK = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> yV = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> ye = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> yH = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> yc = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> yX = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> ya = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> yp = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> yF = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> yA = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> yf = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> yC = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> yS = Map.of("facing", "south", "powered", "false");
   private static final Map<String, String> yx = Map.of("facing", "south", "powered", "true");
   private static final Map<String, String> yD = Map.of("facing", "up");
   private static final Map<String, String> yh = Map.of("conditional", "false", "facing", "up");
   private static final Map<String, String> yr = Map.of("conditional", "true", "facing", "up");
   private static final Map<String, String> LN = Map.of("extended", "false", "facing", "up");
   private static final Map<String, String> Ly = Map.of("extended", "true", "facing", "up");
   private static final Map<String, String> LL = Map.of("facing", "up", "powered", "false");
   private static final Map<String, String> Lu = Map.of("facing", "up", "powered", "true");
   private static final Map<String, String> Li = Map.of("facing", "west");
   private static final Map<String, String> LR = Map.of("conditional", "false", "facing", "west");
   private static final Map<String, String> LM = Map.of("conditional", "true", "facing", "west");
   private static final Map<String, String> LB = Map.of("extended", "false", "facing", "west");
   private static final Map<String, String> LZ = Map.of("extended", "true", "facing", "west");
   private static final Map<String, String> Lz = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> LU = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> LE = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> LW = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> Lm = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> LP = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> Ls = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> LT = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> Lb = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> Lj = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> Lv = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> Ln = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> Lt = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> LG = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> Ll = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> Ld = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> Lw = Map.of("facing", "west", "powered", "false");
   private static final Map<String, String> Lk = Map.of("facing", "west", "powered", "true");
   private static final Map<String, String> LY = Map.of("facing", "east", "half", "bottom", "open", "false");
   private static final Map<String, String> LQ = Map.of("facing", "north", "half", "bottom", "open", "false");
   private static final Map<String, String> LO = Map.of("facing", "south", "half", "bottom", "open", "false");
   private static final Map<String, String> Lg = Map.of("facing", "west", "half", "bottom", "open", "false");
   private static final Map<String, String> LI = Map.of("facing", "east", "half", "bottom", "open", "true");
   private static final Map<String, String> LJ = Map.of("facing", "north", "half", "bottom", "open", "true");
   private static final Map<String, String> Lo = Map.of("facing", "south", "half", "bottom", "open", "true");
   private static final Map<String, String> Lq = Map.of("facing", "west", "half", "bottom", "open", "true");
   private static final Map<String, String> LK = Map.of("facing", "east", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> LV = Map.of("facing", "north", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> Le = Map.of("facing", "south", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> LH = Map.of("facing", "west", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> Lc = Map.of("facing", "east", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> LX = Map.of("facing", "north", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> La = Map.of("facing", "south", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> Lp = Map.of("facing", "west", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> LF = Map.of("facing", "east", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> LA = Map.of("facing", "north", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> Lf = Map.of("facing", "south", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> LC = Map.of("facing", "west", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> LS = Map.of("facing", "east", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> Lx = Map.of("facing", "north", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> LD = Map.of("facing", "south", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> Lh = Map.of("facing", "west", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> Lr = Map.of("facing", "east", "half", "bottom", "shape", "straight");
   private static final Map<String, String> uN = Map.of("facing", "north", "half", "bottom", "shape", "straight");
   private static final Map<String, String> uy = Map.of("facing", "south", "half", "bottom", "shape", "straight");
   private static final Map<String, String> uL = Map.of("facing", "west", "half", "bottom", "shape", "straight");
   private static final Map<String, String> uu = Map.of("half", "lower");
   private static final Map<String, String> ui = Map.of("facing", "east", "half", "top", "open", "false");
   private static final Map<String, String> uR = Map.of("facing", "north", "half", "top", "open", "false");
   private static final Map<String, String> uM = Map.of("facing", "south", "half", "top", "open", "false");
   private static final Map<String, String> uB = Map.of("facing", "west", "half", "top", "open", "false");
   private static final Map<String, String> uZ = Map.of("facing", "east", "half", "top", "open", "true");
   private static final Map<String, String> uz = Map.of("facing", "north", "half", "top", "open", "true");
   private static final Map<String, String> uU = Map.of("facing", "south", "half", "top", "open", "true");
   private static final Map<String, String> uE = Map.of("facing", "west", "half", "top", "open", "true");
   private static final Map<String, String> uW = Map.of("facing", "east", "half", "top", "shape", "inner_left");
   private static final Map<String, String> um = Map.of("facing", "north", "half", "top", "shape", "inner_left");
   private static final Map<String, String> uP = Map.of("facing", "south", "half", "top", "shape", "inner_left");
   private static final Map<String, String> us = Map.of("facing", "west", "half", "top", "shape", "inner_left");
   private static final Map<String, String> uT = Map.of("facing", "east", "half", "top", "shape", "inner_right");
   private static final Map<String, String> ub = Map.of("facing", "north", "half", "top", "shape", "inner_right");
   private static final Map<String, String> uj = Map.of("facing", "south", "half", "top", "shape", "inner_right");
   private static final Map<String, String> uv = Map.of("facing", "west", "half", "top", "shape", "inner_right");
   private static final Map<String, String> un = Map.of("facing", "east", "half", "top", "shape", "outer_left");
   private static final Map<String, String> ut = Map.of("facing", "north", "half", "top", "shape", "outer_left");
   private static final Map<String, String> uG = Map.of("facing", "south", "half", "top", "shape", "outer_left");
   private static final Map<String, String> ul = Map.of("facing", "west", "half", "top", "shape", "outer_left");
   private static final Map<String, String> ud = Map.of("facing", "east", "half", "top", "shape", "outer_right");
   private static final Map<String, String> uw = Map.of("facing", "north", "half", "top", "shape", "outer_right");
   private static final Map<String, String> uk = Map.of("facing", "south", "half", "top", "shape", "outer_right");
   private static final Map<String, String> uY = Map.of("facing", "west", "half", "top", "shape", "outer_right");
   private static final Map<String, String> uQ = Map.of("facing", "east", "half", "top", "shape", "straight");
   private static final Map<String, String> uO = Map.of("facing", "north", "half", "top", "shape", "straight");
   private static final Map<String, String> ug = Map.of("facing", "south", "half", "top", "shape", "straight");
   private static final Map<String, String> uI = Map.of("facing", "west", "half", "top", "shape", "straight");
   private static final Map<String, String> uJ = Map.of("half", "upper");
   private static final Map<String, String> uo = Map.of("level", "0");
   private static final Map<String, String> uq = Map.of("level", "1");
   private static final Map<String, String> uK = Map.of("level", "10");
   private static final Map<String, String> uV = Map.of("level", "11");
   private static final Map<String, String> ue = Map.of("level", "12");
   private static final Map<String, String> uH = Map.of("level", "13");
   private static final Map<String, String> uc = Map.of("level", "14");
   private static final Map<String, String> uX = Map.of("level", "15");
   private static final Map<String, String> ua = Map.of("level", "2");
   private static final Map<String, String> up = Map.of("level", "3");
   private static final Map<String, String> uF = Map.of("level", "4");
   private static final Map<String, String> uA = Map.of("level", "5");
   private static final Map<String, String> uf = Map.of("level", "6");
   private static final Map<String, String> uC = Map.of("level", "7");
   private static final Map<String, String> uS = Map.of("level", "8");
   private static final Map<String, String> ux = Map.of("level", "9");
   private static final Map<String, String> uD = Map.of("lit", "false");
   private static final Map<String, String> uh = Map.of("lit", "true");
   private static final Map<String, String> ur = Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false");
   private static final Map<String, String> iN = Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> iy = Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false");
   private static final Map<String, String> iL = Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true");
   private static final Map<String, String> iu = Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true");
   private static final Map<String, String> ii = Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> iR = Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false");
   private static final Map<String, String> iM = Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> iB = Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true");
   private static final Map<String, String> iZ = Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true");
   private static final Map<String, String> iz = Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> iU = Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true");
   private static final Map<String, String> iE = Map.of("powered", "false");
   private static final Map<String, String> iW = Map.of("facing", "east", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> im = Map.of("facing", "north", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> iP = Map.of("facing", "south", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> is = Map.of("facing", "west", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> iT = Map.of("facing", "east", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> ib = Map.of("facing", "north", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> ij = Map.of("facing", "south", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> iv = Map.of("facing", "west", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> in = Map.of("facing", "east", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> it = Map.of("facing", "north", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> iG = Map.of("facing", "south", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> il = Map.of("facing", "west", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> id = Map.of("facing", "east", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> iw = Map.of("facing", "north", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> ik = Map.of("facing", "south", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> iY = Map.of("facing", "west", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> iQ = Map.of("facing", "east", "mode", "compare", "powered", "false");
   private static final Map<String, String> iO = Map.of("facing", "north", "mode", "compare", "powered", "false");
   private static final Map<String, String> ig = Map.of("facing", "south", "mode", "compare", "powered", "false");
   private static final Map<String, String> iI = Map.of("facing", "west", "mode", "compare", "powered", "false");
   private static final Map<String, String> iJ = Map.of("facing", "east", "mode", "subtract", "powered", "false");
   private static final Map<String, String> io = Map.of("facing", "north", "mode", "subtract", "powered", "false");
   private static final Map<String, String> iq = Map.of("facing", "south", "mode", "subtract", "powered", "false");
   private static final Map<String, String> iK = Map.of("facing", "west", "mode", "subtract", "powered", "false");
   private static final Map<String, String> iV = Map.of("powered", "true");
   private static final Map<String, String> ie = Map.of("facing", "east", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> iH = Map.of("facing", "north", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> ic = Map.of("facing", "south", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> iX = Map.of("facing", "west", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> ia = Map.of("facing", "east", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> ip = Map.of("facing", "north", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> iF = Map.of("facing", "south", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> iA = Map.of("facing", "west", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> f_if__1 = Map.of("facing", "east", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> iC = Map.of("facing", "north", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> iS = Map.of("facing", "south", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> ix = Map.of("facing", "west", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> iD = Map.of("facing", "east", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> ih = Map.of("facing", "north", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> ir = Map.of("facing", "south", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> RN = Map.of("facing", "west", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> Ry = Map.of("facing", "east", "mode", "compare", "powered", "true");
   private static final Map<String, String> RL = Map.of("facing", "north", "mode", "compare", "powered", "true");
   private static final Map<String, String> Ru = Map.of("facing", "south", "mode", "compare", "powered", "true");
   private static final Map<String, String> Ri = Map.of("facing", "west", "mode", "compare", "powered", "true");
   private static final Map<String, String> RR = Map.of("facing", "east", "mode", "subtract", "powered", "true");
   private static final Map<String, String> RM = Map.of("facing", "north", "mode", "subtract", "powered", "true");
   private static final Map<String, String> RB = Map.of("facing", "south", "mode", "subtract", "powered", "true");
   private static final Map<String, String> RZ = Map.of("facing", "west", "mode", "subtract", "powered", "true");
   private static final Map<String, String> Rz = Map.of("power", "0");
   private static final Map<String, String> RU = Map.of("power", "1");
   private static final Map<String, String> RE = Map.of("power", "10");
   private static final Map<String, String> RW = Map.of("power", "11");
   private static final Map<String, String> Rm = Map.of("power", "12");
   private static final Map<String, String> RP = Map.of("power", "13");
   private static final Map<String, String> Rs = Map.of("power", "14");
   private static final Map<String, String> RT = Map.of("power", "15");
   private static final Map<String, String> Rb = Map.of("power", "2");
   private static final Map<String, String> Rj = Map.of("power", "3");
   private static final Map<String, String> Rv = Map.of("power", "4");
   private static final Map<String, String> Rn = Map.of("power", "5");
   private static final Map<String, String> Rt = Map.of("power", "6");
   private static final Map<String, String> RG = Map.of("power", "7");
   private static final Map<String, String> Rl = Map.of("power", "8");
   private static final Map<String, String> Rd = Map.of("power", "9");
   private static final Map<String, String> Rw = Map.of("rotation", "0");
   private static final Map<String, String> Rk = Map.of("rotation", "1");
   private static final Map<String, String> RY = Map.of("rotation", "10");
   private static final Map<String, String> RQ = Map.of("rotation", "11");
   private static final Map<String, String> RO = Map.of("rotation", "12");
   private static final Map<String, String> Rg = Map.of("rotation", "13");
   private static final Map<String, String> RI = Map.of("rotation", "14");
   private static final Map<String, String> RJ = Map.of("rotation", "15");
   private static final Map<String, String> Ro = Map.of("rotation", "2");
   private static final Map<String, String> Rq = Map.of("rotation", "3");
   private static final Map<String, String> RK = Map.of("rotation", "4");
   private static final Map<String, String> RV = Map.of("rotation", "5");
   private static final Map<String, String> Re = Map.of("rotation", "6");
   private static final Map<String, String> RH = Map.of("rotation", "7");
   private static final Map<String, String> Rc = Map.of("rotation", "8");
   private static final Map<String, String> RX = Map.of("rotation", "9");
   private static final Map<String, String> Ra = Map.of("powered", "false", "shape", "ascending_east");
   private static final Map<String, String> Rp = Map.of("powered", "true", "shape", "ascending_east");
   private static final Map<String, String> RF = Map.of("powered", "false", "shape", "ascending_north");
   private static final Map<String, String> RA = Map.of("powered", "true", "shape", "ascending_north");
   private static final Map<String, String> Rf = Map.of("powered", "false", "shape", "ascending_south");
   private static final Map<String, String> RC = Map.of("powered", "true", "shape", "ascending_south");
   private static final Map<String, String> RS = Map.of("powered", "false", "shape", "ascending_west");
   private static final Map<String, String> Rx = Map.of("powered", "true", "shape", "ascending_west");
   private static final Map<String, String> RD = Map.of("powered", "false", "shape", "east_west");
   private static final Map<String, String> Rh = Map.of("powered", "true", "shape", "east_west");
   private static final Map<String, String> Rr = Map.of("powered", "false", "shape", "north_south");
   private static final Map<String, String> MN = Map.of("powered", "true", "shape", "north_south");
   private static final Map<String, String> My = Map.of("snowy", "false");
   private static final Map<String, String> ML = Map.of("stage", "0");
   private static final Map<String, String> Mu = Map.of("stage", "1");
   private static final Map<String, String> Mi = Map.of("facing", "down", "triggered", "false");
   private static final Map<String, String> MR = Map.of("facing", "east", "triggered", "false");
   private static final Map<String, String> MM = Map.of("facing", "north", "triggered", "false");
   private static final Map<String, String> MB = Map.of("facing", "south", "triggered", "false");
   private static final Map<String, String> MZ = Map.of("facing", "up", "triggered", "false");
   private static final Map<String, String> Mz = Map.of("facing", "west", "triggered", "false");
   private static final Map<String, String> MU = Map.of("facing", "down", "triggered", "true");
   private static final Map<String, String> ME = Map.of("facing", "east", "triggered", "true");
   private static final Map<String, String> MW = Map.of("facing", "north", "triggered", "true");
   private static final Map<String, String> Mm = Map.of("facing", "south", "triggered", "true");
   private static final Map<String, String> MP = Map.of("facing", "up", "triggered", "true");
   private static final Map<String, String> Ms = Map.of("facing", "west", "triggered", "true");
   private static final Map<String, String> MT = Map.of("type", "bottom");
   private static final Map<String, String> Mb = Map.of("type", "double");
   private static final Map<String, String> Mj = Map.of("type", "top");
   private static final Map<String, String> Mv = Map.of("east", "false", "north", "false", "south", "false", "up", "false", "west", "false");
   private static final Map<String, String> Mn = Map.of("east", "false", "north", "false", "south", "false", "west", "false");
   private static final Map<String, String> Mt = Map.of("east", "true", "north", "false", "south", "false", "west", "false");
   private static final Map<String, String> MG = Map.of("east", "false", "north", "false", "south", "true", "west", "false");
   private static final Map<String, String> Ml = Map.of("east", "true", "north", "false", "south", "true", "west", "false");
   private static final Map<String, String> Md = Map.of("east", "false", "north", "true", "south", "false", "west", "false");
   private static final Map<String, String> Mw = Map.of("east", "true", "north", "true", "south", "false", "west", "false");
   private static final Map<String, String> Mk = Map.of("east", "false", "north", "true", "south", "true", "west", "false");
   private static final Map<String, String> MY = Map.of("east", "true", "north", "true", "south", "true", "west", "false");
   private static final Map<String, String> MQ = Map.of("east", "false", "north", "false", "south", "false", "west", "true");
   private static final Map<String, String> MO = Map.of("east", "true", "north", "false", "south", "false", "west", "true");
   private static final Map<String, String> Mg = Map.of("east", "false", "north", "false", "south", "true", "west", "true");
   private static final Map<String, String> MI = Map.of("east", "true", "north", "false", "south", "true", "west", "true");
   private static final Map<String, String> MJ = Map.of("east", "false", "north", "true", "south", "false", "west", "true");
   private static final Map<String, String> Mo = Map.of("east", "true", "north", "true", "south", "false", "west", "true");
   private static final Map<String, String> Mq = Map.of("east", "false", "north", "true", "south", "true", "west", "true");
   private static final Map<String, String> MK = Map.of("east", "true", "north", "true", "south", "true", "west", "true");

   private static void L() {
      N(256, y("minecraft:coal_ore"), y("minecraft:coal_ore"));
      N(272, N("minecraft:oak_log", V), N("minecraft:log", Map.of("axis", "y", "variant", "oak")));
      N(273, N("minecraft:spruce_log", V), N("minecraft:log", Map.of("axis", "y", "variant", "spruce")));
      N(274, N("minecraft:birch_log", V), N("minecraft:log", Map.of("axis", "y", "variant", "birch")));
      N(275, N("minecraft:jungle_log", V), N("minecraft:log", Map.of("axis", "y", "variant", "jungle")));
      N(276, N("minecraft:oak_log", K), N("minecraft:log", Map.of("axis", "x", "variant", "oak")));
      N(277, N("minecraft:spruce_log", K), N("minecraft:log", Map.of("axis", "x", "variant", "spruce")));
      N(278, N("minecraft:birch_log", K), N("minecraft:log", Map.of("axis", "x", "variant", "birch")));
      N(279, N("minecraft:jungle_log", K), N("minecraft:log", Map.of("axis", "x", "variant", "jungle")));
      N(280, N("minecraft:oak_log", e), N("minecraft:log", Map.of("axis", "z", "variant", "oak")));
      N(281, N("minecraft:spruce_log", e), N("minecraft:log", Map.of("axis", "z", "variant", "spruce")));
      N(282, N("minecraft:birch_log", e), N("minecraft:log", Map.of("axis", "z", "variant", "birch")));
      N(283, N("minecraft:jungle_log", e), N("minecraft:log", Map.of("axis", "z", "variant", "jungle")));
      N(284, y("minecraft:oak_bark"), N("minecraft:log", Map.of("axis", "none", "variant", "oak")));
      N(285, y("minecraft:spruce_bark"), N("minecraft:log", Map.of("axis", "none", "variant", "spruce")));
      N(286, y("minecraft:birch_bark"), N("minecraft:log", Map.of("axis", "none", "variant", "birch")));
      N(287, y("minecraft:jungle_bark"), N("minecraft:log", Map.of("axis", "none", "variant", "jungle")));
      N(288, N("minecraft:oak_leaves", c), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "oak")));
      N(289, N("minecraft:spruce_leaves", c), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "spruce")));
      N(290, N("minecraft:birch_leaves", c), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "birch")));
      N(291, N("minecraft:jungle_leaves", c), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "jungle")));
      N(292, N("minecraft:oak_leaves", H), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "oak")));
      N(293, N("minecraft:spruce_leaves", H), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "spruce")));
      N(294, N("minecraft:birch_leaves", H), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "birch")));
      N(295, N("minecraft:jungle_leaves", H), N("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "jungle")));
      N(296, N("minecraft:oak_leaves", a), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "oak")));
      N(297, N("minecraft:spruce_leaves", a), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "spruce")));
      N(298, N("minecraft:birch_leaves", a), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "birch")));
      N(299, N("minecraft:jungle_leaves", a), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "jungle")));
      N(300, N("minecraft:oak_leaves", X), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "oak")));
      N(301, N("minecraft:spruce_leaves", X), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "spruce")));
      N(302, N("minecraft:birch_leaves", X), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "birch")));
      N(303, N("minecraft:jungle_leaves", X), N("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "jungle")));
      N(304, y("minecraft:sponge"), N("minecraft:sponge", Map.of("wet", "false")));
      N(305, y("minecraft:wet_sponge"), N("minecraft:sponge", Map.of("wet", "true")));
      N(320, y("minecraft:glass"), y("minecraft:glass"));
      N(336, y("minecraft:lapis_ore"), y("minecraft:lapis_ore"));
      N(352, y("minecraft:lapis_block"), y("minecraft:lapis_block"));
      N(368, N("minecraft:dispenser", Mi), N("minecraft:dispenser", Mi));
      N(369, N("minecraft:dispenser", MZ), N("minecraft:dispenser", MZ));
      N(370, N("minecraft:dispenser", MM), N("minecraft:dispenser", MM));
      N(371, N("minecraft:dispenser", MB), N("minecraft:dispenser", MB));
      N(372, N("minecraft:dispenser", Mz), N("minecraft:dispenser", Mz));
      N(373, N("minecraft:dispenser", MR), N("minecraft:dispenser", MR));
      N(376, N("minecraft:dispenser", MU), N("minecraft:dispenser", MU));
      N(377, N("minecraft:dispenser", MP), N("minecraft:dispenser", MP));
      N(378, N("minecraft:dispenser", MW), N("minecraft:dispenser", MW));
      N(379, N("minecraft:dispenser", Mm), N("minecraft:dispenser", Mm));
      N(380, N("minecraft:dispenser", Ms), N("minecraft:dispenser", Ms));
      N(381, N("minecraft:dispenser", ME), N("minecraft:dispenser", ME));
      N(384, y("minecraft:sandstone"), N("minecraft:sandstone", Map.of("type", "sandstone")));
      N(385, y("minecraft:chiseled_sandstone"), N("minecraft:sandstone", Map.of("type", "chiseled_sandstone")));
      N(386, y("minecraft:cut_sandstone"), N("minecraft:sandstone", Map.of("type", "smooth_sandstone")));
      N(400, y("minecraft:note_block"), y("minecraft:noteblock"));
      N(
         416,
         N("minecraft:red_bed", Map.of("facing", "south", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "south", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "south", "occupied", "true", "part", "foot"))
      );
      N(
         417,
         N("minecraft:red_bed", Map.of("facing", "west", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "west", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "west", "occupied", "true", "part", "foot"))
      );
      N(
         418,
         N("minecraft:red_bed", Map.of("facing", "north", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "north", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "north", "occupied", "true", "part", "foot"))
      );
      N(
         419,
         N("minecraft:red_bed", Map.of("facing", "east", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "east", "occupied", "false", "part", "foot")),
         N("minecraft:bed", Map.of("facing", "east", "occupied", "true", "part", "foot"))
      );
      N(
         424,
         N("minecraft:red_bed", Map.of("facing", "south", "occupied", "false", "part", "head")),
         N("minecraft:bed", Map.of("facing", "south", "occupied", "false", "part", "head"))
      );
      N(
         425,
         N("minecraft:red_bed", Map.of("facing", "west", "occupied", "false", "part", "head")),
         N("minecraft:bed", Map.of("facing", "west", "occupied", "false", "part", "head"))
      );
      N(
         426,
         N("minecraft:red_bed", Map.of("facing", "north", "occupied", "false", "part", "head")),
         N("minecraft:bed", Map.of("facing", "north", "occupied", "false", "part", "head"))
      );
      N(
         427,
         N("minecraft:red_bed", Map.of("facing", "east", "occupied", "false", "part", "head")),
         N("minecraft:bed", Map.of("facing", "east", "occupied", "false", "part", "head"))
      );
      N(
         428,
         N("minecraft:red_bed", Map.of("facing", "south", "occupied", "true", "part", "head")),
         N("minecraft:bed", Map.of("facing", "south", "occupied", "true", "part", "head"))
      );
      N(
         429,
         N("minecraft:red_bed", Map.of("facing", "west", "occupied", "true", "part", "head")),
         N("minecraft:bed", Map.of("facing", "west", "occupied", "true", "part", "head"))
      );
      N(
         430,
         N("minecraft:red_bed", Map.of("facing", "north", "occupied", "true", "part", "head")),
         N("minecraft:bed", Map.of("facing", "north", "occupied", "true", "part", "head"))
      );
      N(
         431,
         N("minecraft:red_bed", Map.of("facing", "east", "occupied", "true", "part", "head")),
         N("minecraft:bed", Map.of("facing", "east", "occupied", "true", "part", "head"))
      );
      N(432, N("minecraft:powered_rail", Rr), N("minecraft:golden_rail", Rr));
      N(433, N("minecraft:powered_rail", RD), N("minecraft:golden_rail", RD));
      N(434, N("minecraft:powered_rail", Ra), N("minecraft:golden_rail", Ra));
      N(435, N("minecraft:powered_rail", RS), N("minecraft:golden_rail", RS));
      N(436, N("minecraft:powered_rail", RF), N("minecraft:golden_rail", RF));
      N(437, N("minecraft:powered_rail", Rf), N("minecraft:golden_rail", Rf));
      N(440, N("minecraft:powered_rail", MN), N("minecraft:golden_rail", MN));
      N(441, N("minecraft:powered_rail", Rh), N("minecraft:golden_rail", Rh));
      N(442, N("minecraft:powered_rail", Rp), N("minecraft:golden_rail", Rp));
      N(443, N("minecraft:powered_rail", Rx), N("minecraft:golden_rail", Rx));
      N(444, N("minecraft:powered_rail", RA), N("minecraft:golden_rail", RA));
      N(445, N("minecraft:powered_rail", RC), N("minecraft:golden_rail", RC));
      N(448, N("minecraft:detector_rail", Rr), N("minecraft:detector_rail", Rr));
      N(449, N("minecraft:detector_rail", RD), N("minecraft:detector_rail", RD));
      N(450, N("minecraft:detector_rail", Ra), N("minecraft:detector_rail", Ra));
      N(451, N("minecraft:detector_rail", RS), N("minecraft:detector_rail", RS));
      N(452, N("minecraft:detector_rail", RF), N("minecraft:detector_rail", RF));
      N(453, N("minecraft:detector_rail", Rf), N("minecraft:detector_rail", Rf));
      N(456, N("minecraft:detector_rail", MN), N("minecraft:detector_rail", MN));
      N(457, N("minecraft:detector_rail", Rh), N("minecraft:detector_rail", Rh));
      N(458, N("minecraft:detector_rail", Rp), N("minecraft:detector_rail", Rp));
      N(459, N("minecraft:detector_rail", Rx), N("minecraft:detector_rail", Rx));
      N(460, N("minecraft:detector_rail", RA), N("minecraft:detector_rail", RA));
      N(461, N("minecraft:detector_rail", RC), N("minecraft:detector_rail", RC));
      N(464, N("minecraft:sticky_piston", NQ), N("minecraft:sticky_piston", NQ));
      N(465, N("minecraft:sticky_piston", LN), N("minecraft:sticky_piston", LN));
      N(466, N("minecraft:sticky_piston", yM), N("minecraft:sticky_piston", yM));
      N(467, N("minecraft:sticky_piston", yO), N("minecraft:sticky_piston", yO));
      N(468, N("minecraft:sticky_piston", LB), N("minecraft:sticky_piston", LB));
      N(469, N("minecraft:sticky_piston", NK), N("minecraft:sticky_piston", NK));
      N(472, N("minecraft:sticky_piston", NO), N("minecraft:sticky_piston", NO));
      N(473, N("minecraft:sticky_piston", Ly), N("minecraft:sticky_piston", Ly));
      N(474, N("minecraft:sticky_piston", yB), N("minecraft:sticky_piston", yB));
      N(475, N("minecraft:sticky_piston", yg), N("minecraft:sticky_piston", yg));
      N(476, N("minecraft:sticky_piston", LZ), N("minecraft:sticky_piston", LZ));
      N(477, N("minecraft:sticky_piston", NV), N("minecraft:sticky_piston", NV));
      N(480, y("minecraft:cobweb"), y("minecraft:web"));
      N(496, y("minecraft:dead_bush"), N("minecraft:tallgrass", Map.of("type", "dead_bush")));
      N(497, y("minecraft:grass"), N("minecraft:tallgrass", Map.of("type", "tall_grass")));
      N(498, y("minecraft:fern"), N("minecraft:tallgrass", Map.of("type", "fern")));
   }

   private static void M() {
      N(
         1024,
         N("minecraft:oak_door", Nc),
         N("minecraft:wooden_door", Ne),
         N("minecraft:wooden_door", Na),
         N("minecraft:wooden_door", Nc),
         N("minecraft:wooden_door", NF)
      );
      N(
         1025,
         N("minecraft:oak_door", yo),
         N("minecraft:wooden_door", yI),
         N("minecraft:wooden_door", yK),
         N("minecraft:wooden_door", yo),
         N("minecraft:wooden_door", ye)
      );
      N(
         1026,
         N("minecraft:oak_door", LE),
         N("minecraft:wooden_door", Lz),
         N("minecraft:wooden_door", Lm),
         N("minecraft:wooden_door", LE),
         N("minecraft:wooden_door", Ls)
      );
      N(
         1027,
         N("minecraft:oak_door", yU),
         N("minecraft:wooden_door", yZ),
         N("minecraft:wooden_door", yW),
         N("minecraft:wooden_door", yU),
         N("minecraft:wooden_door", yP)
      );
      N(
         1028,
         N("minecraft:oak_door", NS),
         N("minecraft:wooden_door", Nf),
         N("minecraft:wooden_door", ND),
         N("minecraft:wooden_door", NS),
         N("minecraft:wooden_door", Nr)
      );
      N(
         1029,
         N("minecraft:oak_door", ya),
         N("minecraft:wooden_door", yc),
         N("minecraft:wooden_door", yF),
         N("minecraft:wooden_door", ya),
         N("minecraft:wooden_door", yf)
      );
      N(
         1030,
         N("minecraft:oak_door", Lv),
         N("minecraft:wooden_door", Lb),
         N("minecraft:wooden_door", Lt),
         N("minecraft:wooden_door", Lv),
         N("minecraft:wooden_door", Ll)
      );
      N(
         1031,
         N("minecraft:oak_door", yj),
         N("minecraft:wooden_door", yT),
         N("minecraft:wooden_door", yn),
         N("minecraft:wooden_door", yj),
         N("minecraft:wooden_door", yG)
      );
      N(
         1032,
         N("minecraft:oak_door", NH),
         N("minecraft:wooden_door", NH),
         N("minecraft:wooden_door", NC),
         N("minecraft:wooden_door", yz),
         N("minecraft:wooden_door", yb),
         N("minecraft:wooden_door", yJ),
         N("minecraft:wooden_door", yX),
         N("minecraft:wooden_door", LU),
         N("minecraft:wooden_door", Lj)
      );
      N(
         1033,
         N("minecraft:oak_door", NX),
         N("minecraft:wooden_door", NX),
         N("minecraft:wooden_door", Nx),
         N("minecraft:wooden_door", yE),
         N("minecraft:wooden_door", yv),
         N("minecraft:wooden_door", yq),
         N("minecraft:wooden_door", yp),
         N("minecraft:wooden_door", LW),
         N("minecraft:wooden_door", Ln)
      );
      N(
         1034,
         N("minecraft:oak_door", Np),
         N("minecraft:wooden_door", Np),
         N("minecraft:wooden_door", Nh),
         N("minecraft:wooden_door", ym),
         N("minecraft:wooden_door", yt),
         N("minecraft:wooden_door", yV),
         N("minecraft:wooden_door", yA),
         N("minecraft:wooden_door", LP),
         N("minecraft:wooden_door", LG)
      );
      N(
         1035,
         N("minecraft:oak_door", NA),
         N("minecraft:wooden_door", NA),
         N("minecraft:wooden_door", yN),
         N("minecraft:wooden_door", ys),
         N("minecraft:wooden_door", yl),
         N("minecraft:wooden_door", yH),
         N("minecraft:wooden_door", yC),
         N("minecraft:wooden_door", LT),
         N("minecraft:wooden_door", Ld)
      );
      N(1036, N("minecraft:oak_door", NC));
      N(1037, N("minecraft:oak_door", yX));
      N(1038, N("minecraft:oak_door", Lj));
      N(1039, N("minecraft:oak_door", yb));
      N(1042, N("minecraft:ladder", yu), N("minecraft:ladder", yu));
      N(1043, N("minecraft:ladder", yk), N("minecraft:ladder", yk));
      N(1044, N("minecraft:ladder", Li), N("minecraft:ladder", Li));
      N(1045, N("minecraft:ladder", NJ), N("minecraft:ladder", NJ));
      N(1056, N("minecraft:rail", Map.of("shape", "north_south")), N("minecraft:rail", Map.of("shape", "north_south")));
      N(1057, N("minecraft:rail", Map.of("shape", "east_west")), N("minecraft:rail", Map.of("shape", "east_west")));
      N(1058, N("minecraft:rail", Map.of("shape", "ascending_east")), N("minecraft:rail", Map.of("shape", "ascending_east")));
      N(1059, N("minecraft:rail", Map.of("shape", "ascending_west")), N("minecraft:rail", Map.of("shape", "ascending_west")));
      N(1060, N("minecraft:rail", Map.of("shape", "ascending_north")), N("minecraft:rail", Map.of("shape", "ascending_north")));
      N(1061, N("minecraft:rail", Map.of("shape", "ascending_south")), N("minecraft:rail", Map.of("shape", "ascending_south")));
      N(1062, N("minecraft:rail", Map.of("shape", "south_east")), N("minecraft:rail", Map.of("shape", "south_east")));
      N(1063, N("minecraft:rail", Map.of("shape", "south_west")), N("minecraft:rail", Map.of("shape", "south_west")));
      N(1064, N("minecraft:rail", Map.of("shape", "north_west")), N("minecraft:rail", Map.of("shape", "north_west")));
      N(1065, N("minecraft:rail", Map.of("shape", "north_east")), N("minecraft:rail", Map.of("shape", "north_east")));
      N(
         1072,
         N("minecraft:cobblestone_stairs", Lr),
         N("minecraft:stone_stairs", LK),
         N("minecraft:stone_stairs", Lc),
         N("minecraft:stone_stairs", LF),
         N("minecraft:stone_stairs", LS),
         N("minecraft:stone_stairs", Lr)
      );
      N(
         1073,
         N("minecraft:cobblestone_stairs", uL),
         N("minecraft:stone_stairs", LH),
         N("minecraft:stone_stairs", Lp),
         N("minecraft:stone_stairs", LC),
         N("minecraft:stone_stairs", Lh),
         N("minecraft:stone_stairs", uL)
      );
      N(
         1074,
         N("minecraft:cobblestone_stairs", uy),
         N("minecraft:stone_stairs", Le),
         N("minecraft:stone_stairs", La),
         N("minecraft:stone_stairs", Lf),
         N("minecraft:stone_stairs", LD),
         N("minecraft:stone_stairs", uy)
      );
      N(
         1075,
         N("minecraft:cobblestone_stairs", uN),
         N("minecraft:stone_stairs", LV),
         N("minecraft:stone_stairs", LX),
         N("minecraft:stone_stairs", LA),
         N("minecraft:stone_stairs", Lx),
         N("minecraft:stone_stairs", uN)
      );
      N(
         1076,
         N("minecraft:cobblestone_stairs", uQ),
         N("minecraft:stone_stairs", uW),
         N("minecraft:stone_stairs", uT),
         N("minecraft:stone_stairs", un),
         N("minecraft:stone_stairs", ud),
         N("minecraft:stone_stairs", uQ)
      );
      N(
         1077,
         N("minecraft:cobblestone_stairs", uI),
         N("minecraft:stone_stairs", us),
         N("minecraft:stone_stairs", uv),
         N("minecraft:stone_stairs", ul),
         N("minecraft:stone_stairs", uY),
         N("minecraft:stone_stairs", uI)
      );
      N(
         1078,
         N("minecraft:cobblestone_stairs", ug),
         N("minecraft:stone_stairs", uP),
         N("minecraft:stone_stairs", uj),
         N("minecraft:stone_stairs", uG),
         N("minecraft:stone_stairs", uk),
         N("minecraft:stone_stairs", ug)
      );
      N(
         1079,
         N("minecraft:cobblestone_stairs", uO),
         N("minecraft:stone_stairs", um),
         N("minecraft:stone_stairs", ub),
         N("minecraft:stone_stairs", ut),
         N("minecraft:stone_stairs", uw),
         N("minecraft:stone_stairs", uO)
      );
      N(1090, N("minecraft:wall_sign", yu), N("minecraft:wall_sign", yu));
      N(1091, N("minecraft:wall_sign", yk), N("minecraft:wall_sign", yk));
      N(1092, N("minecraft:wall_sign", Li), N("minecraft:wall_sign", Li));
      N(1093, N("minecraft:wall_sign", NJ), N("minecraft:wall_sign", NJ));
      N(
         1104,
         N("minecraft:lever", Map.of("face", "ceiling", "facing", "west", "powered", "false")),
         N("minecraft:lever", Map.of("facing", "down_x", "powered", "false"))
      );
      N(1105, N("minecraft:lever", Nb), N("minecraft:lever", yy));
      N(1106, N("minecraft:lever", Nn), N("minecraft:lever", Lw));
      N(1107, N("minecraft:lever", Nv), N("minecraft:lever", yS));
      N(1108, N("minecraft:lever", Nj), N("minecraft:lever", yd));
      N(1109, N("minecraft:lever", Ns), N("minecraft:lever", Map.of("facing", "up_z", "powered", "false")));
      N(
         1110,
         N("minecraft:lever", Map.of("face", "floor", "facing", "west", "powered", "false")),
         N("minecraft:lever", Map.of("facing", "up_x", "powered", "false"))
      );
      N(1111, N("minecraft:lever", Nm), N("minecraft:lever", Map.of("facing", "down_z", "powered", "false")));
      N(
         1112,
         N("minecraft:lever", Map.of("face", "ceiling", "facing", "west", "powered", "true")),
         N("minecraft:lever", Map.of("facing", "down_x", "powered", "true"))
      );
      N(1113, N("minecraft:lever", Nt), N("minecraft:lever", yL));
      N(1114, N("minecraft:lever", Nd), N("minecraft:lever", Lk));
      N(1115, N("minecraft:lever", Nl), N("minecraft:lever", yx));
      N(1116, N("minecraft:lever", NG), N("minecraft:lever", yw));
      N(1117, N("minecraft:lever", NT), N("minecraft:lever", Map.of("facing", "up_z", "powered", "true")));
      N(
         1118,
         N("minecraft:lever", Map.of("face", "floor", "facing", "west", "powered", "true")),
         N("minecraft:lever", Map.of("facing", "up_x", "powered", "true"))
      );
      N(1119, N("minecraft:lever", NP), N("minecraft:lever", Map.of("facing", "down_z", "powered", "true")));
      N(1120, N("minecraft:stone_pressure_plate", iE), N("minecraft:stone_pressure_plate", iE));
      N(1121, N("minecraft:stone_pressure_plate", iV), N("minecraft:stone_pressure_plate", iV));
      N(
         1136,
         N("minecraft:iron_door", Nc),
         N("minecraft:iron_door", Ne),
         N("minecraft:iron_door", Na),
         N("minecraft:iron_door", Nc),
         N("minecraft:iron_door", NF)
      );
      N(
         1137,
         N("minecraft:iron_door", yo),
         N("minecraft:iron_door", yI),
         N("minecraft:iron_door", yK),
         N("minecraft:iron_door", yo),
         N("minecraft:iron_door", ye)
      );
      N(
         1138,
         N("minecraft:iron_door", LE),
         N("minecraft:iron_door", Lz),
         N("minecraft:iron_door", Lm),
         N("minecraft:iron_door", LE),
         N("minecraft:iron_door", Ls)
      );
      N(
         1139,
         N("minecraft:iron_door", yU),
         N("minecraft:iron_door", yZ),
         N("minecraft:iron_door", yW),
         N("minecraft:iron_door", yU),
         N("minecraft:iron_door", yP)
      );
      N(
         1140,
         N("minecraft:iron_door", NS),
         N("minecraft:iron_door", Nf),
         N("minecraft:iron_door", ND),
         N("minecraft:iron_door", NS),
         N("minecraft:iron_door", Nr)
      );
      N(
         1141,
         N("minecraft:iron_door", ya),
         N("minecraft:iron_door", yc),
         N("minecraft:iron_door", yF),
         N("minecraft:iron_door", ya),
         N("minecraft:iron_door", yf)
      );
      N(
         1142,
         N("minecraft:iron_door", Lv),
         N("minecraft:iron_door", Lb),
         N("minecraft:iron_door", Lt),
         N("minecraft:iron_door", Lv),
         N("minecraft:iron_door", Ll)
      );
      N(
         1143,
         N("minecraft:iron_door", yj),
         N("minecraft:iron_door", yT),
         N("minecraft:iron_door", yn),
         N("minecraft:iron_door", yj),
         N("minecraft:iron_door", yG)
      );
      N(
         1144,
         N("minecraft:iron_door", NH),
         N("minecraft:iron_door", NH),
         N("minecraft:iron_door", NC),
         N("minecraft:iron_door", yz),
         N("minecraft:iron_door", yb),
         N("minecraft:iron_door", yJ),
         N("minecraft:iron_door", yX),
         N("minecraft:iron_door", LU),
         N("minecraft:iron_door", Lj)
      );
      N(
         1145,
         N("minecraft:iron_door", NX),
         N("minecraft:iron_door", NX),
         N("minecraft:iron_door", Nx),
         N("minecraft:iron_door", yE),
         N("minecraft:iron_door", yv),
         N("minecraft:iron_door", yq),
         N("minecraft:iron_door", yp),
         N("minecraft:iron_door", LW),
         N("minecraft:iron_door", Ln)
      );
      N(
         1146,
         N("minecraft:iron_door", Np),
         N("minecraft:iron_door", Np),
         N("minecraft:iron_door", Nh),
         N("minecraft:iron_door", ym),
         N("minecraft:iron_door", yt),
         N("minecraft:iron_door", yV),
         N("minecraft:iron_door", yA),
         N("minecraft:iron_door", LP),
         N("minecraft:iron_door", LG)
      );
      N(
         1147,
         N("minecraft:iron_door", NA),
         N("minecraft:iron_door", NA),
         N("minecraft:iron_door", yN),
         N("minecraft:iron_door", ys),
         N("minecraft:iron_door", yl),
         N("minecraft:iron_door", yH),
         N("minecraft:iron_door", yC),
         N("minecraft:iron_door", LT),
         N("minecraft:iron_door", Ld)
      );
      N(1148, N("minecraft:iron_door", NC));
      N(1149, N("minecraft:iron_door", yX));
      N(1150, N("minecraft:iron_door", Lj));
      N(1151, N("minecraft:iron_door", yb));
      N(1152, N("minecraft:oak_pressure_plate", iE), N("minecraft:wooden_pressure_plate", iE));
      N(1153, N("minecraft:oak_pressure_plate", iV), N("minecraft:wooden_pressure_plate", iV));
      N(1168, N("minecraft:redstone_ore", uD), y("minecraft:redstone_ore"));
      N(1184, N("minecraft:redstone_ore", uh), y("minecraft:lit_redstone_ore"));
      N(1201, N("minecraft:redstone_wall_torch", Map.of("facing", "east", "lit", "false")), N("minecraft:unlit_redstone_torch", NJ));
      N(1202, N("minecraft:redstone_wall_torch", Map.of("facing", "west", "lit", "false")), N("minecraft:unlit_redstone_torch", Li));
      N(1203, N("minecraft:redstone_wall_torch", Map.of("facing", "south", "lit", "false")), N("minecraft:unlit_redstone_torch", yk));
      N(1204, N("minecraft:redstone_wall_torch", Map.of("facing", "north", "lit", "false")), N("minecraft:unlit_redstone_torch", yu));
      N(1205, N("minecraft:redstone_torch", uD), N("minecraft:unlit_redstone_torch", yD));
      N(1217, N("minecraft:redstone_wall_torch", Map.of("facing", "east", "lit", "true")), N("minecraft:redstone_torch", NJ));
      N(1218, N("minecraft:redstone_wall_torch", Map.of("facing", "west", "lit", "true")), N("minecraft:redstone_torch", Li));
      N(1219, N("minecraft:redstone_wall_torch", Map.of("facing", "south", "lit", "true")), N("minecraft:redstone_torch", yk));
      N(1220, N("minecraft:redstone_wall_torch", Map.of("facing", "north", "lit", "true")), N("minecraft:redstone_torch", yu));
      N(1221, N("minecraft:redstone_torch", uh), N("minecraft:redstone_torch", yD));
      N(1232, N("minecraft:stone_button", Nm), N("minecraft:stone_button", Ng));
      N(1233, N("minecraft:stone_button", Nb), N("minecraft:stone_button", yy));
      N(1234, N("minecraft:stone_button", Nn), N("minecraft:stone_button", Lw));
      N(1235, N("minecraft:stone_button", Nv), N("minecraft:stone_button", yS));
      N(1236, N("minecraft:stone_button", Nj), N("minecraft:stone_button", yd));
      N(1237, N("minecraft:stone_button", Ns), N("minecraft:stone_button", LL));
      N(1240, N("minecraft:stone_button", NP), N("minecraft:stone_button", NI));
      N(1241, N("minecraft:stone_button", Nt), N("minecraft:stone_button", yL));
      N(1242, N("minecraft:stone_button", Nd), N("minecraft:stone_button", Lk));
      N(1243, N("minecraft:stone_button", Nl), N("minecraft:stone_button", yx));
      N(1244, N("minecraft:stone_button", NG), N("minecraft:stone_button", yw));
      N(1245, N("minecraft:stone_button", NT), N("minecraft:stone_button", Lu));
      N(1248, N("minecraft:snow", Map.of("layers", "1")), N("minecraft:snow_layer", Map.of("layers", "1")));
      N(1249, N("minecraft:snow", Map.of("layers", "2")), N("minecraft:snow_layer", Map.of("layers", "2")));
      N(1250, N("minecraft:snow", Map.of("layers", "3")), N("minecraft:snow_layer", Map.of("layers", "3")));
      N(1251, N("minecraft:snow", Map.of("layers", "4")), N("minecraft:snow_layer", Map.of("layers", "4")));
      N(1252, N("minecraft:snow", Map.of("layers", "5")), N("minecraft:snow_layer", Map.of("layers", "5")));
      N(1253, N("minecraft:snow", Map.of("layers", "6")), N("minecraft:snow_layer", Map.of("layers", "6")));
      N(1254, N("minecraft:snow", Map.of("layers", "7")), N("minecraft:snow_layer", Map.of("layers", "7")));
      N(1255, N("minecraft:snow", Map.of("layers", "8")), N("minecraft:snow_layer", Map.of("layers", "8")));
      N(1264, y("minecraft:ice"), y("minecraft:ice"));
   }

   private static void P() {
      N(
         3072,
         N("minecraft:acacia_fence", Mn),
         N("minecraft:acacia_fence", Mn),
         N("minecraft:acacia_fence", MQ),
         N("minecraft:acacia_fence", MG),
         N("minecraft:acacia_fence", Mg),
         N("minecraft:acacia_fence", Md),
         N("minecraft:acacia_fence", MJ),
         N("minecraft:acacia_fence", Mk),
         N("minecraft:acacia_fence", Mq),
         N("minecraft:acacia_fence", Mt),
         N("minecraft:acacia_fence", MO),
         N("minecraft:acacia_fence", Ml),
         N("minecraft:acacia_fence", MI),
         N("minecraft:acacia_fence", Mw),
         N("minecraft:acacia_fence", Mo),
         N("minecraft:acacia_fence", MY),
         N("minecraft:acacia_fence", MK)
      );
      N(
         3088,
         N("minecraft:spruce_door", Nc),
         N("minecraft:spruce_door", Ne),
         N("minecraft:spruce_door", Na),
         N("minecraft:spruce_door", Nc),
         N("minecraft:spruce_door", NF)
      );
      N(
         3089,
         N("minecraft:spruce_door", yo),
         N("minecraft:spruce_door", yI),
         N("minecraft:spruce_door", yK),
         N("minecraft:spruce_door", yo),
         N("minecraft:spruce_door", ye)
      );
      N(
         3090,
         N("minecraft:spruce_door", LE),
         N("minecraft:spruce_door", Lz),
         N("minecraft:spruce_door", Lm),
         N("minecraft:spruce_door", LE),
         N("minecraft:spruce_door", Ls)
      );
      N(
         3091,
         N("minecraft:spruce_door", yU),
         N("minecraft:spruce_door", yZ),
         N("minecraft:spruce_door", yW),
         N("minecraft:spruce_door", yU),
         N("minecraft:spruce_door", yP)
      );
      N(
         3092,
         N("minecraft:spruce_door", NS),
         N("minecraft:spruce_door", Nf),
         N("minecraft:spruce_door", ND),
         N("minecraft:spruce_door", NS),
         N("minecraft:spruce_door", Nr)
      );
      N(
         3093,
         N("minecraft:spruce_door", ya),
         N("minecraft:spruce_door", yc),
         N("minecraft:spruce_door", yF),
         N("minecraft:spruce_door", ya),
         N("minecraft:spruce_door", yf)
      );
      N(
         3094,
         N("minecraft:spruce_door", Lv),
         N("minecraft:spruce_door", Lb),
         N("minecraft:spruce_door", Lt),
         N("minecraft:spruce_door", Lv),
         N("minecraft:spruce_door", Ll)
      );
      N(
         3095,
         N("minecraft:spruce_door", yj),
         N("minecraft:spruce_door", yT),
         N("minecraft:spruce_door", yn),
         N("minecraft:spruce_door", yj),
         N("minecraft:spruce_door", yG)
      );
      N(
         3096,
         N("minecraft:spruce_door", NH),
         N("minecraft:spruce_door", NH),
         N("minecraft:spruce_door", NC),
         N("minecraft:spruce_door", yz),
         N("minecraft:spruce_door", yb),
         N("minecraft:spruce_door", yJ),
         N("minecraft:spruce_door", yX),
         N("minecraft:spruce_door", LU),
         N("minecraft:spruce_door", Lj)
      );
      N(
         3097,
         N("minecraft:spruce_door", NX),
         N("minecraft:spruce_door", NX),
         N("minecraft:spruce_door", Nx),
         N("minecraft:spruce_door", yE),
         N("minecraft:spruce_door", yv),
         N("minecraft:spruce_door", yq),
         N("minecraft:spruce_door", yp),
         N("minecraft:spruce_door", LW),
         N("minecraft:spruce_door", Ln)
      );
      N(
         3098,
         N("minecraft:spruce_door", Np),
         N("minecraft:spruce_door", Np),
         N("minecraft:spruce_door", Nh),
         N("minecraft:spruce_door", ym),
         N("minecraft:spruce_door", yt),
         N("minecraft:spruce_door", yV),
         N("minecraft:spruce_door", yA),
         N("minecraft:spruce_door", LP),
         N("minecraft:spruce_door", LG)
      );
      N(
         3099,
         N("minecraft:spruce_door", NA),
         N("minecraft:spruce_door", NA),
         N("minecraft:spruce_door", yN),
         N("minecraft:spruce_door", ys),
         N("minecraft:spruce_door", yl),
         N("minecraft:spruce_door", yH),
         N("minecraft:spruce_door", yC),
         N("minecraft:spruce_door", LT),
         N("minecraft:spruce_door", Ld)
      );
      N(
         3104,
         N("minecraft:birch_door", Nc),
         N("minecraft:birch_door", Ne),
         N("minecraft:birch_door", Na),
         N("minecraft:birch_door", Nc),
         N("minecraft:birch_door", NF)
      );
      N(
         3105,
         N("minecraft:birch_door", yo),
         N("minecraft:birch_door", yI),
         N("minecraft:birch_door", yK),
         N("minecraft:birch_door", yo),
         N("minecraft:birch_door", ye)
      );
      N(
         3106,
         N("minecraft:birch_door", LE),
         N("minecraft:birch_door", Lz),
         N("minecraft:birch_door", Lm),
         N("minecraft:birch_door", LE),
         N("minecraft:birch_door", Ls)
      );
      N(
         3107,
         N("minecraft:birch_door", yU),
         N("minecraft:birch_door", yZ),
         N("minecraft:birch_door", yW),
         N("minecraft:birch_door", yU),
         N("minecraft:birch_door", yP)
      );
      N(
         3108,
         N("minecraft:birch_door", NS),
         N("minecraft:birch_door", Nf),
         N("minecraft:birch_door", ND),
         N("minecraft:birch_door", NS),
         N("minecraft:birch_door", Nr)
      );
      N(
         3109,
         N("minecraft:birch_door", ya),
         N("minecraft:birch_door", yc),
         N("minecraft:birch_door", yF),
         N("minecraft:birch_door", ya),
         N("minecraft:birch_door", yf)
      );
      N(
         3110,
         N("minecraft:birch_door", Lv),
         N("minecraft:birch_door", Lb),
         N("minecraft:birch_door", Lt),
         N("minecraft:birch_door", Lv),
         N("minecraft:birch_door", Ll)
      );
      N(
         3111,
         N("minecraft:birch_door", yj),
         N("minecraft:birch_door", yT),
         N("minecraft:birch_door", yn),
         N("minecraft:birch_door", yj),
         N("minecraft:birch_door", yG)
      );
      N(
         3112,
         N("minecraft:birch_door", NH),
         N("minecraft:birch_door", NH),
         N("minecraft:birch_door", NC),
         N("minecraft:birch_door", yz),
         N("minecraft:birch_door", yb),
         N("minecraft:birch_door", yJ),
         N("minecraft:birch_door", yX),
         N("minecraft:birch_door", LU),
         N("minecraft:birch_door", Lj)
      );
      N(
         3113,
         N("minecraft:birch_door", NX),
         N("minecraft:birch_door", NX),
         N("minecraft:birch_door", Nx),
         N("minecraft:birch_door", yE),
         N("minecraft:birch_door", yv),
         N("minecraft:birch_door", yq),
         N("minecraft:birch_door", yp),
         N("minecraft:birch_door", LW),
         N("minecraft:birch_door", Ln)
      );
      N(
         3114,
         N("minecraft:birch_door", Np),
         N("minecraft:birch_door", Np),
         N("minecraft:birch_door", Nh),
         N("minecraft:birch_door", ym),
         N("minecraft:birch_door", yt),
         N("minecraft:birch_door", yV),
         N("minecraft:birch_door", yA),
         N("minecraft:birch_door", LP),
         N("minecraft:birch_door", LG)
      );
      N(
         3115,
         N("minecraft:birch_door", NA),
         N("minecraft:birch_door", NA),
         N("minecraft:birch_door", yN),
         N("minecraft:birch_door", ys),
         N("minecraft:birch_door", yl),
         N("minecraft:birch_door", yH),
         N("minecraft:birch_door", yC),
         N("minecraft:birch_door", LT),
         N("minecraft:birch_door", Ld)
      );
      N(
         3120,
         N("minecraft:jungle_door", Nc),
         N("minecraft:jungle_door", Ne),
         N("minecraft:jungle_door", Na),
         N("minecraft:jungle_door", Nc),
         N("minecraft:jungle_door", NF)
      );
      N(
         3121,
         N("minecraft:jungle_door", yo),
         N("minecraft:jungle_door", yI),
         N("minecraft:jungle_door", yK),
         N("minecraft:jungle_door", yo),
         N("minecraft:jungle_door", ye)
      );
      N(
         3122,
         N("minecraft:jungle_door", LE),
         N("minecraft:jungle_door", Lz),
         N("minecraft:jungle_door", Lm),
         N("minecraft:jungle_door", LE),
         N("minecraft:jungle_door", Ls)
      );
      N(
         3123,
         N("minecraft:jungle_door", yU),
         N("minecraft:jungle_door", yZ),
         N("minecraft:jungle_door", yW),
         N("minecraft:jungle_door", yU),
         N("minecraft:jungle_door", yP)
      );
      N(
         3124,
         N("minecraft:jungle_door", NS),
         N("minecraft:jungle_door", Nf),
         N("minecraft:jungle_door", ND),
         N("minecraft:jungle_door", NS),
         N("minecraft:jungle_door", Nr)
      );
      N(
         3125,
         N("minecraft:jungle_door", ya),
         N("minecraft:jungle_door", yc),
         N("minecraft:jungle_door", yF),
         N("minecraft:jungle_door", ya),
         N("minecraft:jungle_door", yf)
      );
      N(
         3126,
         N("minecraft:jungle_door", Lv),
         N("minecraft:jungle_door", Lb),
         N("minecraft:jungle_door", Lt),
         N("minecraft:jungle_door", Lv),
         N("minecraft:jungle_door", Ll)
      );
      N(
         3127,
         N("minecraft:jungle_door", yj),
         N("minecraft:jungle_door", yT),
         N("minecraft:jungle_door", yn),
         N("minecraft:jungle_door", yj),
         N("minecraft:jungle_door", yG)
      );
      N(
         3128,
         N("minecraft:jungle_door", NH),
         N("minecraft:jungle_door", NH),
         N("minecraft:jungle_door", NC),
         N("minecraft:jungle_door", yz),
         N("minecraft:jungle_door", yb),
         N("minecraft:jungle_door", yJ),
         N("minecraft:jungle_door", yX),
         N("minecraft:jungle_door", LU),
         N("minecraft:jungle_door", Lj)
      );
      N(
         3129,
         N("minecraft:jungle_door", NX),
         N("minecraft:jungle_door", NX),
         N("minecraft:jungle_door", Nx),
         N("minecraft:jungle_door", yE),
         N("minecraft:jungle_door", yv),
         N("minecraft:jungle_door", yq),
         N("minecraft:jungle_door", yp),
         N("minecraft:jungle_door", LW),
         N("minecraft:jungle_door", Ln)
      );
      N(
         3130,
         N("minecraft:jungle_door", Np),
         N("minecraft:jungle_door", Np),
         N("minecraft:jungle_door", Nh),
         N("minecraft:jungle_door", ym),
         N("minecraft:jungle_door", yt),
         N("minecraft:jungle_door", yV),
         N("minecraft:jungle_door", yA),
         N("minecraft:jungle_door", LP),
         N("minecraft:jungle_door", LG)
      );
      N(
         3131,
         N("minecraft:jungle_door", NA),
         N("minecraft:jungle_door", NA),
         N("minecraft:jungle_door", yN),
         N("minecraft:jungle_door", ys),
         N("minecraft:jungle_door", yl),
         N("minecraft:jungle_door", yH),
         N("minecraft:jungle_door", yC),
         N("minecraft:jungle_door", LT),
         N("minecraft:jungle_door", Ld)
      );
      N(
         3136,
         N("minecraft:acacia_door", Nc),
         N("minecraft:acacia_door", Ne),
         N("minecraft:acacia_door", Na),
         N("minecraft:acacia_door", Nc),
         N("minecraft:acacia_door", NF)
      );
      N(
         3137,
         N("minecraft:acacia_door", yo),
         N("minecraft:acacia_door", yI),
         N("minecraft:acacia_door", yK),
         N("minecraft:acacia_door", yo),
         N("minecraft:acacia_door", ye)
      );
      N(
         3138,
         N("minecraft:acacia_door", LE),
         N("minecraft:acacia_door", Lz),
         N("minecraft:acacia_door", Lm),
         N("minecraft:acacia_door", LE),
         N("minecraft:acacia_door", Ls)
      );
      N(
         3139,
         N("minecraft:acacia_door", yU),
         N("minecraft:acacia_door", yZ),
         N("minecraft:acacia_door", yW),
         N("minecraft:acacia_door", yU),
         N("minecraft:acacia_door", yP)
      );
      N(
         3140,
         N("minecraft:acacia_door", NS),
         N("minecraft:acacia_door", Nf),
         N("minecraft:acacia_door", ND),
         N("minecraft:acacia_door", NS),
         N("minecraft:acacia_door", Nr)
      );
      N(
         3141,
         N("minecraft:acacia_door", ya),
         N("minecraft:acacia_door", yc),
         N("minecraft:acacia_door", yF),
         N("minecraft:acacia_door", ya),
         N("minecraft:acacia_door", yf)
      );
      N(
         3142,
         N("minecraft:acacia_door", Lv),
         N("minecraft:acacia_door", Lb),
         N("minecraft:acacia_door", Lt),
         N("minecraft:acacia_door", Lv),
         N("minecraft:acacia_door", Ll)
      );
      N(
         3143,
         N("minecraft:acacia_door", yj),
         N("minecraft:acacia_door", yT),
         N("minecraft:acacia_door", yn),
         N("minecraft:acacia_door", yj),
         N("minecraft:acacia_door", yG)
      );
      N(
         3144,
         N("minecraft:acacia_door", NH),
         N("minecraft:acacia_door", NH),
         N("minecraft:acacia_door", NC),
         N("minecraft:acacia_door", yz),
         N("minecraft:acacia_door", yb),
         N("minecraft:acacia_door", yJ),
         N("minecraft:acacia_door", yX),
         N("minecraft:acacia_door", LU),
         N("minecraft:acacia_door", Lj)
      );
      N(
         3145,
         N("minecraft:acacia_door", NX),
         N("minecraft:acacia_door", NX),
         N("minecraft:acacia_door", Nx),
         N("minecraft:acacia_door", yE),
         N("minecraft:acacia_door", yv),
         N("minecraft:acacia_door", yq),
         N("minecraft:acacia_door", yp),
         N("minecraft:acacia_door", LW),
         N("minecraft:acacia_door", Ln)
      );
      N(
         3146,
         N("minecraft:acacia_door", Np),
         N("minecraft:acacia_door", Np),
         N("minecraft:acacia_door", Nh),
         N("minecraft:acacia_door", ym),
         N("minecraft:acacia_door", yt),
         N("minecraft:acacia_door", yV),
         N("minecraft:acacia_door", yA),
         N("minecraft:acacia_door", LP),
         N("minecraft:acacia_door", LG)
      );
      N(
         3147,
         N("minecraft:acacia_door", NA),
         N("minecraft:acacia_door", NA),
         N("minecraft:acacia_door", yN),
         N("minecraft:acacia_door", ys),
         N("minecraft:acacia_door", yl),
         N("minecraft:acacia_door", yH),
         N("minecraft:acacia_door", yC),
         N("minecraft:acacia_door", LT),
         N("minecraft:acacia_door", Ld)
      );
      N(
         3152,
         N("minecraft:dark_oak_door", Nc),
         N("minecraft:dark_oak_door", Ne),
         N("minecraft:dark_oak_door", Na),
         N("minecraft:dark_oak_door", Nc),
         N("minecraft:dark_oak_door", NF)
      );
      N(
         3153,
         N("minecraft:dark_oak_door", yo),
         N("minecraft:dark_oak_door", yI),
         N("minecraft:dark_oak_door", yK),
         N("minecraft:dark_oak_door", yo),
         N("minecraft:dark_oak_door", ye)
      );
      N(
         3154,
         N("minecraft:dark_oak_door", LE),
         N("minecraft:dark_oak_door", Lz),
         N("minecraft:dark_oak_door", Lm),
         N("minecraft:dark_oak_door", LE),
         N("minecraft:dark_oak_door", Ls)
      );
      N(
         3155,
         N("minecraft:dark_oak_door", yU),
         N("minecraft:dark_oak_door", yZ),
         N("minecraft:dark_oak_door", yW),
         N("minecraft:dark_oak_door", yU),
         N("minecraft:dark_oak_door", yP)
      );
      N(
         3156,
         N("minecraft:dark_oak_door", NS),
         N("minecraft:dark_oak_door", Nf),
         N("minecraft:dark_oak_door", ND),
         N("minecraft:dark_oak_door", NS),
         N("minecraft:dark_oak_door", Nr)
      );
      N(
         3157,
         N("minecraft:dark_oak_door", ya),
         N("minecraft:dark_oak_door", yc),
         N("minecraft:dark_oak_door", yF),
         N("minecraft:dark_oak_door", ya),
         N("minecraft:dark_oak_door", yf)
      );
      N(
         3158,
         N("minecraft:dark_oak_door", Lv),
         N("minecraft:dark_oak_door", Lb),
         N("minecraft:dark_oak_door", Lt),
         N("minecraft:dark_oak_door", Lv),
         N("minecraft:dark_oak_door", Ll)
      );
      N(
         3159,
         N("minecraft:dark_oak_door", yj),
         N("minecraft:dark_oak_door", yT),
         N("minecraft:dark_oak_door", yn),
         N("minecraft:dark_oak_door", yj),
         N("minecraft:dark_oak_door", yG)
      );
      N(
         3160,
         N("minecraft:dark_oak_door", NH),
         N("minecraft:dark_oak_door", NH),
         N("minecraft:dark_oak_door", NC),
         N("minecraft:dark_oak_door", yz),
         N("minecraft:dark_oak_door", yb),
         N("minecraft:dark_oak_door", yJ),
         N("minecraft:dark_oak_door", yX),
         N("minecraft:dark_oak_door", LU),
         N("minecraft:dark_oak_door", Lj)
      );
      N(
         3161,
         N("minecraft:dark_oak_door", NX),
         N("minecraft:dark_oak_door", NX),
         N("minecraft:dark_oak_door", Nx),
         N("minecraft:dark_oak_door", yE),
         N("minecraft:dark_oak_door", yv),
         N("minecraft:dark_oak_door", yq),
         N("minecraft:dark_oak_door", yp),
         N("minecraft:dark_oak_door", LW),
         N("minecraft:dark_oak_door", Ln)
      );
      N(
         3162,
         N("minecraft:dark_oak_door", Np),
         N("minecraft:dark_oak_door", Np),
         N("minecraft:dark_oak_door", Nh),
         N("minecraft:dark_oak_door", ym),
         N("minecraft:dark_oak_door", yt),
         N("minecraft:dark_oak_door", yV),
         N("minecraft:dark_oak_door", yA),
         N("minecraft:dark_oak_door", LP),
         N("minecraft:dark_oak_door", LG)
      );
      N(
         3163,
         N("minecraft:dark_oak_door", NA),
         N("minecraft:dark_oak_door", NA),
         N("minecraft:dark_oak_door", yN),
         N("minecraft:dark_oak_door", ys),
         N("minecraft:dark_oak_door", yl),
         N("minecraft:dark_oak_door", yH),
         N("minecraft:dark_oak_door", yC),
         N("minecraft:dark_oak_door", LT),
         N("minecraft:dark_oak_door", Ld)
      );
      N(3168, N("minecraft:end_rod", Nw), N("minecraft:end_rod", Nw));
      N(3169, N("minecraft:end_rod", yD), N("minecraft:end_rod", yD));
      N(3170, N("minecraft:end_rod", yu), N("minecraft:end_rod", yu));
      N(3171, N("minecraft:end_rod", yk), N("minecraft:end_rod", yk));
      N(3172, N("minecraft:end_rod", Li), N("minecraft:end_rod", Li));
      N(3173, N("minecraft:end_rod", NJ), N("minecraft:end_rod", NJ));
      N(
         3184,
         N("minecraft:chorus_plant", ur),
         N("minecraft:chorus_plant", ur),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", iN),
         N("minecraft:chorus_plant", iL),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", iy),
         N("minecraft:chorus_plant", iu),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", iM),
         N("minecraft:chorus_plant", iB),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", ii),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", iR),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", iz),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", iZ),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:chorus_plant", iU)
      );
      N(3200, N("minecraft:chorus_flower", B), N("minecraft:chorus_flower", B));
      N(3201, N("minecraft:chorus_flower", W), N("minecraft:chorus_flower", W));
      N(3202, N("minecraft:chorus_flower", l), N("minecraft:chorus_flower", l));
      N(3203, N("minecraft:chorus_flower", Q), N("minecraft:chorus_flower", Q));
      N(3204, N("minecraft:chorus_flower", O), N("minecraft:chorus_flower", O));
      N(3205, N("minecraft:chorus_flower", g), N("minecraft:chorus_flower", g));
      N(3216, y("minecraft:purpur_block"), y("minecraft:purpur_block"));
      N(3232, N("minecraft:purpur_pillar", V), N("minecraft:purpur_pillar", V));
      N(3236, N("minecraft:purpur_pillar", K), N("minecraft:purpur_pillar", K));
      N(3240, N("minecraft:purpur_pillar", e), N("minecraft:purpur_pillar", e));
      N(
         3248,
         N("minecraft:purpur_stairs", Lr),
         N("minecraft:purpur_stairs", LK),
         N("minecraft:purpur_stairs", Lc),
         N("minecraft:purpur_stairs", LF),
         N("minecraft:purpur_stairs", LS),
         N("minecraft:purpur_stairs", Lr)
      );
      N(
         3249,
         N("minecraft:purpur_stairs", uL),
         N("minecraft:purpur_stairs", LH),
         N("minecraft:purpur_stairs", Lp),
         N("minecraft:purpur_stairs", LC),
         N("minecraft:purpur_stairs", Lh),
         N("minecraft:purpur_stairs", uL)
      );
      N(
         3250,
         N("minecraft:purpur_stairs", uy),
         N("minecraft:purpur_stairs", Le),
         N("minecraft:purpur_stairs", La),
         N("minecraft:purpur_stairs", Lf),
         N("minecraft:purpur_stairs", LD),
         N("minecraft:purpur_stairs", uy)
      );
      N(
         3251,
         N("minecraft:purpur_stairs", uN),
         N("minecraft:purpur_stairs", LV),
         N("minecraft:purpur_stairs", LX),
         N("minecraft:purpur_stairs", LA),
         N("minecraft:purpur_stairs", Lx),
         N("minecraft:purpur_stairs", uN)
      );
      N(
         3252,
         N("minecraft:purpur_stairs", uQ),
         N("minecraft:purpur_stairs", uW),
         N("minecraft:purpur_stairs", uT),
         N("minecraft:purpur_stairs", un),
         N("minecraft:purpur_stairs", ud),
         N("minecraft:purpur_stairs", uQ)
      );
      N(
         3253,
         N("minecraft:purpur_stairs", uI),
         N("minecraft:purpur_stairs", us),
         N("minecraft:purpur_stairs", uv),
         N("minecraft:purpur_stairs", ul),
         N("minecraft:purpur_stairs", uY),
         N("minecraft:purpur_stairs", uI)
      );
      N(
         3254,
         N("minecraft:purpur_stairs", ug),
         N("minecraft:purpur_stairs", uP),
         N("minecraft:purpur_stairs", uj),
         N("minecraft:purpur_stairs", uG),
         N("minecraft:purpur_stairs", uk),
         N("minecraft:purpur_stairs", ug)
      );
      N(
         3255,
         N("minecraft:purpur_stairs", uO),
         N("minecraft:purpur_stairs", um),
         N("minecraft:purpur_stairs", ub),
         N("minecraft:purpur_stairs", ut),
         N("minecraft:purpur_stairs", uw),
         N("minecraft:purpur_stairs", uO)
      );
      N(3264, N("minecraft:purpur_slab", Mb), N("minecraft:purpur_double_slab", Map.of("variant", "default")));
      N(3280, N("minecraft:purpur_slab", MT), N("minecraft:purpur_slab", Map.of("half", "bottom", "variant", "default")));
      N(3288, N("minecraft:purpur_slab", Mj), N("minecraft:purpur_slab", Map.of("half", "top", "variant", "default")));
      N(3296, y("minecraft:end_stone_bricks"), y("minecraft:end_bricks"));
      N(3312, N("minecraft:beetroots", B), N("minecraft:beetroots", B));
      N(3313, N("minecraft:beetroots", W), N("minecraft:beetroots", W));
      N(3314, N("minecraft:beetroots", l), N("minecraft:beetroots", l));
      N(3315, N("minecraft:beetroots", Q), N("minecraft:beetroots", Q));
   }

   private static void T() {
      N(3584, N("minecraft:lime_shulker_box", Nw), N("minecraft:lime_shulker_box", Nw));
      N(3585, N("minecraft:lime_shulker_box", yD), N("minecraft:lime_shulker_box", yD));
      N(3586, N("minecraft:lime_shulker_box", yu), N("minecraft:lime_shulker_box", yu));
      N(3587, N("minecraft:lime_shulker_box", yk), N("minecraft:lime_shulker_box", yk));
      N(3588, N("minecraft:lime_shulker_box", Li), N("minecraft:lime_shulker_box", Li));
      N(3589, N("minecraft:lime_shulker_box", NJ), N("minecraft:lime_shulker_box", NJ));
      N(3600, N("minecraft:pink_shulker_box", Nw), N("minecraft:pink_shulker_box", Nw));
      N(3601, N("minecraft:pink_shulker_box", yD), N("minecraft:pink_shulker_box", yD));
      N(3602, N("minecraft:pink_shulker_box", yu), N("minecraft:pink_shulker_box", yu));
      N(3603, N("minecraft:pink_shulker_box", yk), N("minecraft:pink_shulker_box", yk));
      N(3604, N("minecraft:pink_shulker_box", Li), N("minecraft:pink_shulker_box", Li));
      N(3605, N("minecraft:pink_shulker_box", NJ), N("minecraft:pink_shulker_box", NJ));
      N(3616, N("minecraft:gray_shulker_box", Nw), N("minecraft:gray_shulker_box", Nw));
      N(3617, N("minecraft:gray_shulker_box", yD), N("minecraft:gray_shulker_box", yD));
      N(3618, N("minecraft:gray_shulker_box", yu), N("minecraft:gray_shulker_box", yu));
      N(3619, N("minecraft:gray_shulker_box", yk), N("minecraft:gray_shulker_box", yk));
      N(3620, N("minecraft:gray_shulker_box", Li), N("minecraft:gray_shulker_box", Li));
      N(3621, N("minecraft:gray_shulker_box", NJ), N("minecraft:gray_shulker_box", NJ));
      N(3632, N("minecraft:light_gray_shulker_box", Nw), N("minecraft:silver_shulker_box", Nw));
      N(3633, N("minecraft:light_gray_shulker_box", yD), N("minecraft:silver_shulker_box", yD));
      N(3634, N("minecraft:light_gray_shulker_box", yu), N("minecraft:silver_shulker_box", yu));
      N(3635, N("minecraft:light_gray_shulker_box", yk), N("minecraft:silver_shulker_box", yk));
      N(3636, N("minecraft:light_gray_shulker_box", Li), N("minecraft:silver_shulker_box", Li));
      N(3637, N("minecraft:light_gray_shulker_box", NJ), N("minecraft:silver_shulker_box", NJ));
      N(3648, N("minecraft:cyan_shulker_box", Nw), N("minecraft:cyan_shulker_box", Nw));
      N(3649, N("minecraft:cyan_shulker_box", yD), N("minecraft:cyan_shulker_box", yD));
      N(3650, N("minecraft:cyan_shulker_box", yu), N("minecraft:cyan_shulker_box", yu));
      N(3651, N("minecraft:cyan_shulker_box", yk), N("minecraft:cyan_shulker_box", yk));
      N(3652, N("minecraft:cyan_shulker_box", Li), N("minecraft:cyan_shulker_box", Li));
      N(3653, N("minecraft:cyan_shulker_box", NJ), N("minecraft:cyan_shulker_box", NJ));
      N(3664, N("minecraft:purple_shulker_box", Nw), N("minecraft:purple_shulker_box", Nw));
      N(3665, N("minecraft:purple_shulker_box", yD), N("minecraft:purple_shulker_box", yD));
      N(3666, N("minecraft:purple_shulker_box", yu), N("minecraft:purple_shulker_box", yu));
      N(3667, N("minecraft:purple_shulker_box", yk), N("minecraft:purple_shulker_box", yk));
      N(3668, N("minecraft:purple_shulker_box", Li), N("minecraft:purple_shulker_box", Li));
      N(3669, N("minecraft:purple_shulker_box", NJ), N("minecraft:purple_shulker_box", NJ));
      N(3680, N("minecraft:blue_shulker_box", Nw), N("minecraft:blue_shulker_box", Nw));
      N(3681, N("minecraft:blue_shulker_box", yD), N("minecraft:blue_shulker_box", yD));
      N(3682, N("minecraft:blue_shulker_box", yu), N("minecraft:blue_shulker_box", yu));
      N(3683, N("minecraft:blue_shulker_box", yk), N("minecraft:blue_shulker_box", yk));
      N(3684, N("minecraft:blue_shulker_box", Li), N("minecraft:blue_shulker_box", Li));
      N(3685, N("minecraft:blue_shulker_box", NJ), N("minecraft:blue_shulker_box", NJ));
      N(3696, N("minecraft:brown_shulker_box", Nw), N("minecraft:brown_shulker_box", Nw));
      N(3697, N("minecraft:brown_shulker_box", yD), N("minecraft:brown_shulker_box", yD));
      N(3698, N("minecraft:brown_shulker_box", yu), N("minecraft:brown_shulker_box", yu));
      N(3699, N("minecraft:brown_shulker_box", yk), N("minecraft:brown_shulker_box", yk));
      N(3700, N("minecraft:brown_shulker_box", Li), N("minecraft:brown_shulker_box", Li));
      N(3701, N("minecraft:brown_shulker_box", NJ), N("minecraft:brown_shulker_box", NJ));
      N(3712, N("minecraft:green_shulker_box", Nw), N("minecraft:green_shulker_box", Nw));
      N(3713, N("minecraft:green_shulker_box", yD), N("minecraft:green_shulker_box", yD));
      N(3714, N("minecraft:green_shulker_box", yu), N("minecraft:green_shulker_box", yu));
      N(3715, N("minecraft:green_shulker_box", yk), N("minecraft:green_shulker_box", yk));
      N(3716, N("minecraft:green_shulker_box", Li), N("minecraft:green_shulker_box", Li));
      N(3717, N("minecraft:green_shulker_box", NJ), N("minecraft:green_shulker_box", NJ));
      N(3728, N("minecraft:red_shulker_box", Nw), N("minecraft:red_shulker_box", Nw));
      N(3729, N("minecraft:red_shulker_box", yD), N("minecraft:red_shulker_box", yD));
      N(3730, N("minecraft:red_shulker_box", yu), N("minecraft:red_shulker_box", yu));
      N(3731, N("minecraft:red_shulker_box", yk), N("minecraft:red_shulker_box", yk));
      N(3732, N("minecraft:red_shulker_box", Li), N("minecraft:red_shulker_box", Li));
      N(3733, N("minecraft:red_shulker_box", NJ), N("minecraft:red_shulker_box", NJ));
      N(3744, N("minecraft:black_shulker_box", Nw), N("minecraft:black_shulker_box", Nw));
      N(3745, N("minecraft:black_shulker_box", yD), N("minecraft:black_shulker_box", yD));
      N(3746, N("minecraft:black_shulker_box", yu), N("minecraft:black_shulker_box", yu));
      N(3747, N("minecraft:black_shulker_box", yk), N("minecraft:black_shulker_box", yk));
      N(3748, N("minecraft:black_shulker_box", Li), N("minecraft:black_shulker_box", Li));
      N(3749, N("minecraft:black_shulker_box", NJ), N("minecraft:black_shulker_box", NJ));
      N(3760, N("minecraft:white_glazed_terracotta", yk), N("minecraft:white_glazed_terracotta", yk));
      N(3761, N("minecraft:white_glazed_terracotta", Li), N("minecraft:white_glazed_terracotta", Li));
      N(3762, N("minecraft:white_glazed_terracotta", yu), N("minecraft:white_glazed_terracotta", yu));
      N(3763, N("minecraft:white_glazed_terracotta", NJ), N("minecraft:white_glazed_terracotta", NJ));
      N(3776, N("minecraft:orange_glazed_terracotta", yk), N("minecraft:orange_glazed_terracotta", yk));
      N(3777, N("minecraft:orange_glazed_terracotta", Li), N("minecraft:orange_glazed_terracotta", Li));
      N(3778, N("minecraft:orange_glazed_terracotta", yu), N("minecraft:orange_glazed_terracotta", yu));
      N(3779, N("minecraft:orange_glazed_terracotta", NJ), N("minecraft:orange_glazed_terracotta", NJ));
      N(3792, N("minecraft:magenta_glazed_terracotta", yk), N("minecraft:magenta_glazed_terracotta", yk));
      N(3793, N("minecraft:magenta_glazed_terracotta", Li), N("minecraft:magenta_glazed_terracotta", Li));
      N(3794, N("minecraft:magenta_glazed_terracotta", yu), N("minecraft:magenta_glazed_terracotta", yu));
      N(3795, N("minecraft:magenta_glazed_terracotta", NJ), N("minecraft:magenta_glazed_terracotta", NJ));
      N(3808, N("minecraft:light_blue_glazed_terracotta", yk), N("minecraft:light_blue_glazed_terracotta", yk));
      N(3809, N("minecraft:light_blue_glazed_terracotta", Li), N("minecraft:light_blue_glazed_terracotta", Li));
      N(3810, N("minecraft:light_blue_glazed_terracotta", yu), N("minecraft:light_blue_glazed_terracotta", yu));
      N(3811, N("minecraft:light_blue_glazed_terracotta", NJ), N("minecraft:light_blue_glazed_terracotta", NJ));
      N(3824, N("minecraft:yellow_glazed_terracotta", yk), N("minecraft:yellow_glazed_terracotta", yk));
      N(3825, N("minecraft:yellow_glazed_terracotta", Li), N("minecraft:yellow_glazed_terracotta", Li));
      N(3826, N("minecraft:yellow_glazed_terracotta", yu), N("minecraft:yellow_glazed_terracotta", yu));
      N(3827, N("minecraft:yellow_glazed_terracotta", NJ), N("minecraft:yellow_glazed_terracotta", NJ));
   }

   public class05803() {
      super();
   }

   static {
      u.defaultReturnValue(-1);
      y();
      L();
      u();
      i();
      R();
      M();
      B();
      Z();
      z();
      U();
      E();
      W();
      m();
      P();
      s();
      T();
      b();
      N();
   }

   private static void B() {
      N(1280, y("minecraft:snow_block"), y("minecraft:snow"));
      N(1296, N("minecraft:cactus", B), N("minecraft:cactus", B));
      N(1297, N("minecraft:cactus", W), N("minecraft:cactus", W));
      N(1298, N("minecraft:cactus", l), N("minecraft:cactus", l));
      N(1299, N("minecraft:cactus", Q), N("minecraft:cactus", Q));
      N(1300, N("minecraft:cactus", O), N("minecraft:cactus", O));
      N(1301, N("minecraft:cactus", g), N("minecraft:cactus", g));
      N(1302, N("minecraft:cactus", I), N("minecraft:cactus", I));
      N(1303, N("minecraft:cactus", J), N("minecraft:cactus", J));
      N(1304, N("minecraft:cactus", o), N("minecraft:cactus", o));
      N(1305, N("minecraft:cactus", q), N("minecraft:cactus", q));
      N(1306, N("minecraft:cactus", m), N("minecraft:cactus", m));
      N(1307, N("minecraft:cactus", P), N("minecraft:cactus", P));
      N(1308, N("minecraft:cactus", s), N("minecraft:cactus", s));
      N(1309, N("minecraft:cactus", T), N("minecraft:cactus", T));
      N(1310, N("minecraft:cactus", b), N("minecraft:cactus", b));
      N(1311, N("minecraft:cactus", j), N("minecraft:cactus", j));
      N(1312, y("minecraft:clay"), y("minecraft:clay"));
      N(1328, N("minecraft:sugar_cane", B), N("minecraft:reeds", B));
      N(1329, N("minecraft:sugar_cane", W), N("minecraft:reeds", W));
      N(1330, N("minecraft:sugar_cane", l), N("minecraft:reeds", l));
      N(1331, N("minecraft:sugar_cane", Q), N("minecraft:reeds", Q));
      N(1332, N("minecraft:sugar_cane", O), N("minecraft:reeds", O));
      N(1333, N("minecraft:sugar_cane", g), N("minecraft:reeds", g));
      N(1334, N("minecraft:sugar_cane", I), N("minecraft:reeds", I));
      N(1335, N("minecraft:sugar_cane", J), N("minecraft:reeds", J));
      N(1336, N("minecraft:sugar_cane", o), N("minecraft:reeds", o));
      N(1337, N("minecraft:sugar_cane", q), N("minecraft:reeds", q));
      N(1338, N("minecraft:sugar_cane", m), N("minecraft:reeds", m));
      N(1339, N("minecraft:sugar_cane", P), N("minecraft:reeds", P));
      N(1340, N("minecraft:sugar_cane", s), N("minecraft:reeds", s));
      N(1341, N("minecraft:sugar_cane", T), N("minecraft:reeds", T));
      N(1342, N("minecraft:sugar_cane", b), N("minecraft:reeds", b));
      N(1343, N("minecraft:sugar_cane", j), N("minecraft:reeds", j));
      N(1344, N("minecraft:jukebox", Map.of("has_record", "false")), N("minecraft:jukebox", Map.of("has_record", "false")));
      N(1345, N("minecraft:jukebox", Map.of("has_record", "true")), N("minecraft:jukebox", Map.of("has_record", "true")));
      N(
         1360,
         N("minecraft:oak_fence", Mn),
         N("minecraft:fence", Mn),
         N("minecraft:fence", MQ),
         N("minecraft:fence", MG),
         N("minecraft:fence", Mg),
         N("minecraft:fence", Md),
         N("minecraft:fence", MJ),
         N("minecraft:fence", Mk),
         N("minecraft:fence", Mq),
         N("minecraft:fence", Mt),
         N("minecraft:fence", MO),
         N("minecraft:fence", Ml),
         N("minecraft:fence", MI),
         N("minecraft:fence", Mw),
         N("minecraft:fence", Mo),
         N("minecraft:fence", MY),
         N("minecraft:fence", MK)
      );
      N(1376, N("minecraft:carved_pumpkin", yk), N("minecraft:pumpkin", yk));
      N(1377, N("minecraft:carved_pumpkin", Li), N("minecraft:pumpkin", Li));
      N(1378, N("minecraft:carved_pumpkin", yu), N("minecraft:pumpkin", yu));
      N(1379, N("minecraft:carved_pumpkin", NJ), N("minecraft:pumpkin", NJ));
      N(1392, y("minecraft:netherrack"), y("minecraft:netherrack"));
      N(1408, y("minecraft:soul_sand"), y("minecraft:soul_sand"));
      N(1424, y("minecraft:glowstone"), y("minecraft:glowstone"));
      N(1441, N("minecraft:portal", K), N("minecraft:portal", K));
      N(1442, N("minecraft:portal", e), N("minecraft:portal", e));
      N(1456, N("minecraft:jack_o_lantern", yk), N("minecraft:lit_pumpkin", yk));
      N(1457, N("minecraft:jack_o_lantern", Li), N("minecraft:lit_pumpkin", Li));
      N(1458, N("minecraft:jack_o_lantern", yu), N("minecraft:lit_pumpkin", yu));
      N(1459, N("minecraft:jack_o_lantern", NJ), N("minecraft:lit_pumpkin", NJ));
      N(1472, N("minecraft:cake", Map.of("bites", "0")), N("minecraft:cake", Map.of("bites", "0")));
      N(1473, N("minecraft:cake", Map.of("bites", "1")), N("minecraft:cake", Map.of("bites", "1")));
      N(1474, N("minecraft:cake", Map.of("bites", "2")), N("minecraft:cake", Map.of("bites", "2")));
      N(1475, N("minecraft:cake", Map.of("bites", "3")), N("minecraft:cake", Map.of("bites", "3")));
      N(1476, N("minecraft:cake", Map.of("bites", "4")), N("minecraft:cake", Map.of("bites", "4")));
      N(1477, N("minecraft:cake", Map.of("bites", "5")), N("minecraft:cake", Map.of("bites", "5")));
      N(1478, N("minecraft:cake", Map.of("bites", "6")), N("minecraft:cake", Map.of("bites", "6")));
      N(
         1488,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "south", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "south", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "south", "locked", "true"))
      );
      N(
         1489,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "west", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "west", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "west", "locked", "true"))
      );
      N(
         1490,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "north", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "north", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "north", "locked", "true"))
      );
      N(
         1491,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "east", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "east", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "east", "locked", "true"))
      );
      N(
         1492,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "south", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "south", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "south", "locked", "true"))
      );
      N(
         1493,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "west", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "west", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "west", "locked", "true"))
      );
      N(
         1494,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "north", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "north", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "north", "locked", "true"))
      );
      N(
         1495,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "east", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "east", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "east", "locked", "true"))
      );
      N(
         1496,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "south", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "south", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "south", "locked", "true"))
      );
      N(
         1497,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "west", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "west", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "west", "locked", "true"))
      );
      N(
         1498,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "north", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "north", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "north", "locked", "true"))
      );
      N(
         1499,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "east", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "east", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "east", "locked", "true"))
      );
      N(
         1500,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "south", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "south", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "south", "locked", "true"))
      );
      N(
         1501,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "west", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "west", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "west", "locked", "true"))
      );
      N(
         1502,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "north", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "north", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "north", "locked", "true"))
      );
      N(
         1503,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "east", "locked", "false", "powered", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "east", "locked", "false")),
         N("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "east", "locked", "true"))
      );
      N(
         1504,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "south", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "south", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "south", "locked", "true"))
      );
      N(
         1505,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "west", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "west", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "west", "locked", "true"))
      );
      N(
         1506,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "north", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "north", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "north", "locked", "true"))
      );
      N(
         1507,
         N("minecraft:repeater", Map.of("delay", "1", "facing", "east", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "east", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "1", "facing", "east", "locked", "true"))
      );
      N(
         1508,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "south", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "south", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "south", "locked", "true"))
      );
      N(
         1509,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "west", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "west", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "west", "locked", "true"))
      );
      N(
         1510,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "north", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "north", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "north", "locked", "true"))
      );
      N(
         1511,
         N("minecraft:repeater", Map.of("delay", "2", "facing", "east", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "east", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "2", "facing", "east", "locked", "true"))
      );
      N(
         1512,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "south", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "south", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "south", "locked", "true"))
      );
      N(
         1513,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "west", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "west", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "west", "locked", "true"))
      );
      N(
         1514,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "north", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "north", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "north", "locked", "true"))
      );
      N(
         1515,
         N("minecraft:repeater", Map.of("delay", "3", "facing", "east", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "east", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "3", "facing", "east", "locked", "true"))
      );
      N(
         1516,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "south", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "south", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "south", "locked", "true"))
      );
      N(
         1517,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "west", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "west", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "west", "locked", "true"))
      );
      N(
         1518,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "north", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "north", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "north", "locked", "true"))
      );
      N(
         1519,
         N("minecraft:repeater", Map.of("delay", "4", "facing", "east", "locked", "false", "powered", "true")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "east", "locked", "false")),
         N("minecraft:powered_repeater", Map.of("delay", "4", "facing", "east", "locked", "true"))
      );
      N(1520, y("minecraft:white_stained_glass"), N("minecraft:stained_glass", Ni));
      N(1521, y("minecraft:orange_stained_glass"), N("minecraft:stained_glass", r));
      N(1522, y("minecraft:magenta_stained_glass"), N("minecraft:stained_glass", h));
      N(1523, y("minecraft:light_blue_stained_glass"), N("minecraft:stained_glass", x));
      N(1524, y("minecraft:yellow_stained_glass"), N("minecraft:stained_glass", NR));
      N(1525, y("minecraft:lime_stained_glass"), N("minecraft:stained_glass", D));
      N(1526, y("minecraft:pink_stained_glass"), N("minecraft:stained_glass", NN));
      N(1527, y("minecraft:gray_stained_glass"), N("minecraft:stained_glass", C));
      N(1528, y("minecraft:light_gray_stained_glass"), N("minecraft:stained_glass", Nu));
      N(1529, y("minecraft:cyan_stained_glass"), N("minecraft:stained_glass", f));
      N(1530, y("minecraft:purple_stained_glass"), N("minecraft:stained_glass", Ny));
      N(1531, y("minecraft:blue_stained_glass"), N("minecraft:stained_glass", F));
      N(1532, y("minecraft:brown_stained_glass"), N("minecraft:stained_glass", A));
      N(1533, y("minecraft:green_stained_glass"), N("minecraft:stained_glass", S));
      N(1534, y("minecraft:red_stained_glass"), N("minecraft:stained_glass", NL));
      N(1535, y("minecraft:black_stained_glass"), N("minecraft:stained_glass", p));
   }

   private static void Z() {
      N(1536, N("minecraft:oak_trapdoor", LQ), N("minecraft:trapdoor", LQ));
      N(1537, N("minecraft:oak_trapdoor", LO), N("minecraft:trapdoor", LO));
      N(1538, N("minecraft:oak_trapdoor", Lg), N("minecraft:trapdoor", Lg));
      N(1539, N("minecraft:oak_trapdoor", LY), N("minecraft:trapdoor", LY));
      N(1540, N("minecraft:oak_trapdoor", LJ), N("minecraft:trapdoor", LJ));
      N(1541, N("minecraft:oak_trapdoor", Lo), N("minecraft:trapdoor", Lo));
      N(1542, N("minecraft:oak_trapdoor", Lq), N("minecraft:trapdoor", Lq));
      N(1543, N("minecraft:oak_trapdoor", LI), N("minecraft:trapdoor", LI));
      N(1544, N("minecraft:oak_trapdoor", uR), N("minecraft:trapdoor", uR));
      N(1545, N("minecraft:oak_trapdoor", uM), N("minecraft:trapdoor", uM));
      N(1546, N("minecraft:oak_trapdoor", uB), N("minecraft:trapdoor", uB));
      N(1547, N("minecraft:oak_trapdoor", ui), N("minecraft:trapdoor", ui));
      N(1548, N("minecraft:oak_trapdoor", uz), N("minecraft:trapdoor", uz));
      N(1549, N("minecraft:oak_trapdoor", uU), N("minecraft:trapdoor", uU));
      N(1550, N("minecraft:oak_trapdoor", uE), N("minecraft:trapdoor", uE));
      N(1551, N("minecraft:oak_trapdoor", uZ), N("minecraft:trapdoor", uZ));
      N(1552, y("minecraft:infested_stone"), N("minecraft:monster_egg", Map.of("variant", "stone")));
      N(1553, y("minecraft:infested_cobblestone"), N("minecraft:monster_egg", Map.of("variant", "cobblestone")));
      N(1554, y("minecraft:infested_stone_bricks"), N("minecraft:monster_egg", Map.of("variant", "stone_brick")));
      N(1555, y("minecraft:infested_mossy_stone_bricks"), N("minecraft:monster_egg", Map.of("variant", "mossy_brick")));
      N(1556, y("minecraft:infested_cracked_stone_bricks"), N("minecraft:monster_egg", Map.of("variant", "cracked_brick")));
      N(1557, y("minecraft:infested_chiseled_stone_bricks"), N("minecraft:monster_egg", Map.of("variant", "chiseled_brick")));
      N(1568, y("minecraft:stone_bricks"), N("minecraft:stonebrick", Map.of("variant", "stonebrick")));
      N(1569, y("minecraft:mossy_stone_bricks"), N("minecraft:stonebrick", Map.of("variant", "mossy_stonebrick")));
      N(1570, y("minecraft:cracked_stone_bricks"), N("minecraft:stonebrick", Map.of("variant", "cracked_stonebrick")));
      N(1571, y("minecraft:chiseled_stone_bricks"), N("minecraft:stonebrick", Map.of("variant", "chiseled_stonebrick")));
      N(1584, N("minecraft:brown_mushroom_block", ur), N("minecraft:brown_mushroom_block", Map.of("variant", "all_inside")));
      N(1585, N("minecraft:brown_mushroom_block", iB), N("minecraft:brown_mushroom_block", Map.of("variant", "north_west")));
      N(1586, N("minecraft:brown_mushroom_block", iM), N("minecraft:brown_mushroom_block", Map.of("variant", "north")));
      N(1587, N("minecraft:brown_mushroom_block", iz), N("minecraft:brown_mushroom_block", Map.of("variant", "north_east")));
      N(1588, N("minecraft:brown_mushroom_block", iL), N("minecraft:brown_mushroom_block", Map.of("variant", "west")));
      N(1589, N("minecraft:brown_mushroom_block", iN), N("minecraft:brown_mushroom_block", Map.of("variant", "center")));
      N(1590, N("minecraft:brown_mushroom_block", ii), N("minecraft:brown_mushroom_block", Map.of("variant", "east")));
      N(1591, N("minecraft:brown_mushroom_block", iu), N("minecraft:brown_mushroom_block", Map.of("variant", "south_west")));
      N(1592, N("minecraft:brown_mushroom_block", iy), N("minecraft:brown_mushroom_block", Map.of("variant", "south")));
      N(1593, N("minecraft:brown_mushroom_block", iR), N("minecraft:brown_mushroom_block", Map.of("variant", "south_east")));
      N(1594, N("minecraft:mushroom_stem", iZ), N("minecraft:brown_mushroom_block", Map.of("variant", "stem")));
      N(1595, N("minecraft:brown_mushroom_block", ur));
      N(1596, N("minecraft:brown_mushroom_block", ur));
      N(1597, N("minecraft:brown_mushroom_block", ur));
      N(1598, N("minecraft:brown_mushroom_block", iU), N("minecraft:brown_mushroom_block", Map.of("variant", "all_outside")));
      N(1599, N("minecraft:mushroom_stem", iU), N("minecraft:brown_mushroom_block", Map.of("variant", "all_stem")));
      N(1600, N("minecraft:red_mushroom_block", ur), N("minecraft:red_mushroom_block", Map.of("variant", "all_inside")));
      N(1601, N("minecraft:red_mushroom_block", iB), N("minecraft:red_mushroom_block", Map.of("variant", "north_west")));
      N(1602, N("minecraft:red_mushroom_block", iM), N("minecraft:red_mushroom_block", Map.of("variant", "north")));
      N(1603, N("minecraft:red_mushroom_block", iz), N("minecraft:red_mushroom_block", Map.of("variant", "north_east")));
      N(1604, N("minecraft:red_mushroom_block", iL), N("minecraft:red_mushroom_block", Map.of("variant", "west")));
      N(1605, N("minecraft:red_mushroom_block", iN), N("minecraft:red_mushroom_block", Map.of("variant", "center")));
      N(1606, N("minecraft:red_mushroom_block", ii), N("minecraft:red_mushroom_block", Map.of("variant", "east")));
      N(1607, N("minecraft:red_mushroom_block", iu), N("minecraft:red_mushroom_block", Map.of("variant", "south_west")));
      N(1608, N("minecraft:red_mushroom_block", iy), N("minecraft:red_mushroom_block", Map.of("variant", "south")));
      N(1609, N("minecraft:red_mushroom_block", iR), N("minecraft:red_mushroom_block", Map.of("variant", "south_east")));
      N(1610, N("minecraft:mushroom_stem", iZ), N("minecraft:red_mushroom_block", Map.of("variant", "stem")));
      N(1611, N("minecraft:red_mushroom_block", ur));
      N(1612, N("minecraft:red_mushroom_block", ur));
      N(1613, N("minecraft:red_mushroom_block", ur));
      N(1614, N("minecraft:red_mushroom_block", iU), N("minecraft:red_mushroom_block", Map.of("variant", "all_outside")));
      N(1615, N("minecraft:mushroom_stem", iU), N("minecraft:red_mushroom_block", Map.of("variant", "all_stem")));
      N(
         1616,
         N("minecraft:iron_bars", Mn),
         N("minecraft:iron_bars", Mn),
         N("minecraft:iron_bars", MQ),
         N("minecraft:iron_bars", MG),
         N("minecraft:iron_bars", Mg),
         N("minecraft:iron_bars", Md),
         N("minecraft:iron_bars", MJ),
         N("minecraft:iron_bars", Mk),
         N("minecraft:iron_bars", Mq),
         N("minecraft:iron_bars", Mt),
         N("minecraft:iron_bars", MO),
         N("minecraft:iron_bars", Ml),
         N("minecraft:iron_bars", MI),
         N("minecraft:iron_bars", Mw),
         N("minecraft:iron_bars", Mo),
         N("minecraft:iron_bars", MY),
         N("minecraft:iron_bars", MK)
      );
      N(
         1632,
         N("minecraft:glass_pane", Mn),
         N("minecraft:glass_pane", Mn),
         N("minecraft:glass_pane", MQ),
         N("minecraft:glass_pane", MG),
         N("minecraft:glass_pane", Mg),
         N("minecraft:glass_pane", Md),
         N("minecraft:glass_pane", MJ),
         N("minecraft:glass_pane", Mk),
         N("minecraft:glass_pane", Mq),
         N("minecraft:glass_pane", Mt),
         N("minecraft:glass_pane", MO),
         N("minecraft:glass_pane", Ml),
         N("minecraft:glass_pane", MI),
         N("minecraft:glass_pane", Mw),
         N("minecraft:glass_pane", Mo),
         N("minecraft:glass_pane", MY),
         N("minecraft:glass_pane", MK)
      );
      N(1648, y("minecraft:melon_block"), y("minecraft:melon_block"));
      N(
         1664,
         N("minecraft:pumpkin_stem", B),
         N("minecraft:pumpkin_stem", Z),
         N("minecraft:pumpkin_stem", z),
         N("minecraft:pumpkin_stem", U),
         N("minecraft:pumpkin_stem", Map.of("age", "0", "facing", "up")),
         N("minecraft:pumpkin_stem", E)
      );
      N(
         1665,
         N("minecraft:pumpkin_stem", W),
         N("minecraft:pumpkin_stem", v),
         N("minecraft:pumpkin_stem", n),
         N("minecraft:pumpkin_stem", t),
         N("minecraft:pumpkin_stem", Map.of("age", "1", "facing", "up")),
         N("minecraft:pumpkin_stem", G)
      );
      N(
         1666,
         N("minecraft:pumpkin_stem", l),
         N("minecraft:pumpkin_stem", d),
         N("minecraft:pumpkin_stem", w),
         N("minecraft:pumpkin_stem", k),
         N("minecraft:pumpkin_stem", Map.of("age", "2", "facing", "up")),
         N("minecraft:pumpkin_stem", Y)
      );
      N(
         1667,
         N("minecraft:pumpkin_stem", Q),
         N("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "east")),
         N("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "north")),
         N("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "south")),
         N("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "up")),
         N("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "west"))
      );
      N(
         1668,
         N("minecraft:pumpkin_stem", O),
         N("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "east")),
         N("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "north")),
         N("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "south")),
         N("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "up")),
         N("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "west"))
      );
      N(
         1669,
         N("minecraft:pumpkin_stem", g),
         N("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "east")),
         N("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "north")),
         N("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "south")),
         N("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "up")),
         N("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "west"))
      );
      N(
         1670,
         N("minecraft:pumpkin_stem", I),
         N("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "east")),
         N("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "north")),
         N("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "south")),
         N("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "up")),
         N("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "west"))
      );
      N(
         1671,
         N("minecraft:pumpkin_stem", J),
         N("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "east")),
         N("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "north")),
         N("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "south")),
         N("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "up")),
         N("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "west"))
      );
      N(
         1680,
         N("minecraft:melon_stem", B),
         N("minecraft:melon_stem", Z),
         N("minecraft:melon_stem", z),
         N("minecraft:melon_stem", U),
         N("minecraft:melon_stem", Map.of("age", "0", "facing", "up")),
         N("minecraft:melon_stem", E)
      );
      N(
         1681,
         N("minecraft:melon_stem", W),
         N("minecraft:melon_stem", v),
         N("minecraft:melon_stem", n),
         N("minecraft:melon_stem", t),
         N("minecraft:melon_stem", Map.of("age", "1", "facing", "up")),
         N("minecraft:melon_stem", G)
      );
      N(
         1682,
         N("minecraft:melon_stem", l),
         N("minecraft:melon_stem", d),
         N("minecraft:melon_stem", w),
         N("minecraft:melon_stem", k),
         N("minecraft:melon_stem", Map.of("age", "2", "facing", "up")),
         N("minecraft:melon_stem", Y)
      );
      N(
         1683,
         N("minecraft:melon_stem", Q),
         N("minecraft:melon_stem", Map.of("age", "3", "facing", "east")),
         N("minecraft:melon_stem", Map.of("age", "3", "facing", "north")),
         N("minecraft:melon_stem", Map.of("age", "3", "facing", "south")),
         N("minecraft:melon_stem", Map.of("age", "3", "facing", "up")),
         N("minecraft:melon_stem", Map.of("age", "3", "facing", "west"))
      );
      N(
         1684,
         N("minecraft:melon_stem", O),
         N("minecraft:melon_stem", Map.of("age", "4", "facing", "east")),
         N("minecraft:melon_stem", Map.of("age", "4", "facing", "north")),
         N("minecraft:melon_stem", Map.of("age", "4", "facing", "south")),
         N("minecraft:melon_stem", Map.of("age", "4", "facing", "up")),
         N("minecraft:melon_stem", Map.of("age", "4", "facing", "west"))
      );
      N(
         1685,
         N("minecraft:melon_stem", g),
         N("minecraft:melon_stem", Map.of("age", "5", "facing", "east")),
         N("minecraft:melon_stem", Map.of("age", "5", "facing", "north")),
         N("minecraft:melon_stem", Map.of("age", "5", "facing", "south")),
         N("minecraft:melon_stem", Map.of("age", "5", "facing", "up")),
         N("minecraft:melon_stem", Map.of("age", "5", "facing", "west"))
      );
      N(
         1686,
         N("minecraft:melon_stem", I),
         N("minecraft:melon_stem", Map.of("age", "6", "facing", "east")),
         N("minecraft:melon_stem", Map.of("age", "6", "facing", "north")),
         N("minecraft:melon_stem", Map.of("age", "6", "facing", "south")),
         N("minecraft:melon_stem", Map.of("age", "6", "facing", "up")),
         N("minecraft:melon_stem", Map.of("age", "6", "facing", "west"))
      );
      N(
         1687,
         N("minecraft:melon_stem", J),
         N("minecraft:melon_stem", Map.of("age", "7", "facing", "east")),
         N("minecraft:melon_stem", Map.of("age", "7", "facing", "north")),
         N("minecraft:melon_stem", Map.of("age", "7", "facing", "south")),
         N("minecraft:melon_stem", Map.of("age", "7", "facing", "up")),
         N("minecraft:melon_stem", Map.of("age", "7", "facing", "west"))
      );
      N(
         1696,
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:vine", Mv),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "false"))
      );
      N(
         1697,
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "false"))
      );
      N(
         1698,
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "true"))
      );
      N(
         1699,
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "true"))
      );
      N(
         1700,
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "false"))
      );
      N(
         1701,
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "false"))
      );
      N(
         1702,
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "true"))
      );
      N(
         1703,
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         1704,
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "false"))
      );
      N(
         1705,
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "false"))
      );
      N(
         1706,
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "true"))
      );
      N(
         1707,
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "true"))
      );
      N(
         1708,
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "false"))
      );
      N(
         1709,
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "false"))
      );
      N(
         1710,
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "true"))
      );
      N(
         1711,
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(1712, N("minecraft:oak_fence_gate", iP), N("minecraft:fence_gate", iP), N("minecraft:fence_gate", iG));
      N(1713, N("minecraft:oak_fence_gate", is), N("minecraft:fence_gate", is), N("minecraft:fence_gate", il));
      N(1714, N("minecraft:oak_fence_gate", im), N("minecraft:fence_gate", im), N("minecraft:fence_gate", it));
      N(1715, N("minecraft:oak_fence_gate", iW), N("minecraft:fence_gate", iW), N("minecraft:fence_gate", in));
      N(1716, N("minecraft:oak_fence_gate", ij), N("minecraft:fence_gate", ij), N("minecraft:fence_gate", ik));
      N(1717, N("minecraft:oak_fence_gate", iv), N("minecraft:fence_gate", iv), N("minecraft:fence_gate", iY));
      N(1718, N("minecraft:oak_fence_gate", ib), N("minecraft:fence_gate", ib), N("minecraft:fence_gate", iw));
      N(1719, N("minecraft:oak_fence_gate", iT), N("minecraft:fence_gate", iT), N("minecraft:fence_gate", id));
      N(1720, N("minecraft:oak_fence_gate", ic), N("minecraft:fence_gate", ic), N("minecraft:fence_gate", iS));
      N(1721, N("minecraft:oak_fence_gate", iX), N("minecraft:fence_gate", iX), N("minecraft:fence_gate", ix));
      N(1722, N("minecraft:oak_fence_gate", iH), N("minecraft:fence_gate", iH), N("minecraft:fence_gate", iC));
      N(1723, N("minecraft:oak_fence_gate", ie), N("minecraft:fence_gate", ie), N("minecraft:fence_gate", f_if__1));
      N(1724, N("minecraft:oak_fence_gate", iF), N("minecraft:fence_gate", iF), N("minecraft:fence_gate", ir));
      N(1725, N("minecraft:oak_fence_gate", iA), N("minecraft:fence_gate", iA), N("minecraft:fence_gate", RN));
      N(1726, N("minecraft:oak_fence_gate", ip), N("minecraft:fence_gate", ip), N("minecraft:fence_gate", ih));
      N(1727, N("minecraft:oak_fence_gate", ia), N("minecraft:fence_gate", ia), N("minecraft:fence_gate", iD));
      N(
         1728,
         N("minecraft:brick_stairs", Lr),
         N("minecraft:brick_stairs", LK),
         N("minecraft:brick_stairs", Lc),
         N("minecraft:brick_stairs", LF),
         N("minecraft:brick_stairs", LS),
         N("minecraft:brick_stairs", Lr)
      );
      N(
         1729,
         N("minecraft:brick_stairs", uL),
         N("minecraft:brick_stairs", LH),
         N("minecraft:brick_stairs", Lp),
         N("minecraft:brick_stairs", LC),
         N("minecraft:brick_stairs", Lh),
         N("minecraft:brick_stairs", uL)
      );
      N(
         1730,
         N("minecraft:brick_stairs", uy),
         N("minecraft:brick_stairs", Le),
         N("minecraft:brick_stairs", La),
         N("minecraft:brick_stairs", Lf),
         N("minecraft:brick_stairs", LD),
         N("minecraft:brick_stairs", uy)
      );
      N(
         1731,
         N("minecraft:brick_stairs", uN),
         N("minecraft:brick_stairs", LV),
         N("minecraft:brick_stairs", LX),
         N("minecraft:brick_stairs", LA),
         N("minecraft:brick_stairs", Lx),
         N("minecraft:brick_stairs", uN)
      );
      N(
         1732,
         N("minecraft:brick_stairs", uQ),
         N("minecraft:brick_stairs", uW),
         N("minecraft:brick_stairs", uT),
         N("minecraft:brick_stairs", un),
         N("minecraft:brick_stairs", ud),
         N("minecraft:brick_stairs", uQ)
      );
      N(
         1733,
         N("minecraft:brick_stairs", uI),
         N("minecraft:brick_stairs", us),
         N("minecraft:brick_stairs", uv),
         N("minecraft:brick_stairs", ul),
         N("minecraft:brick_stairs", uY),
         N("minecraft:brick_stairs", uI)
      );
      N(
         1734,
         N("minecraft:brick_stairs", ug),
         N("minecraft:brick_stairs", uP),
         N("minecraft:brick_stairs", uj),
         N("minecraft:brick_stairs", uG),
         N("minecraft:brick_stairs", uk),
         N("minecraft:brick_stairs", ug)
      );
      N(
         1735,
         N("minecraft:brick_stairs", uO),
         N("minecraft:brick_stairs", um),
         N("minecraft:brick_stairs", ub),
         N("minecraft:brick_stairs", ut),
         N("minecraft:brick_stairs", uw),
         N("minecraft:brick_stairs", uO)
      );
      N(
         1744,
         N("minecraft:stone_brick_stairs", Lr),
         N("minecraft:stone_brick_stairs", LK),
         N("minecraft:stone_brick_stairs", Lc),
         N("minecraft:stone_brick_stairs", LF),
         N("minecraft:stone_brick_stairs", LS),
         N("minecraft:stone_brick_stairs", Lr)
      );
      N(
         1745,
         N("minecraft:stone_brick_stairs", uL),
         N("minecraft:stone_brick_stairs", LH),
         N("minecraft:stone_brick_stairs", Lp),
         N("minecraft:stone_brick_stairs", LC),
         N("minecraft:stone_brick_stairs", Lh),
         N("minecraft:stone_brick_stairs", uL)
      );
      N(
         1746,
         N("minecraft:stone_brick_stairs", uy),
         N("minecraft:stone_brick_stairs", Le),
         N("minecraft:stone_brick_stairs", La),
         N("minecraft:stone_brick_stairs", Lf),
         N("minecraft:stone_brick_stairs", LD),
         N("minecraft:stone_brick_stairs", uy)
      );
      N(
         1747,
         N("minecraft:stone_brick_stairs", uN),
         N("minecraft:stone_brick_stairs", LV),
         N("minecraft:stone_brick_stairs", LX),
         N("minecraft:stone_brick_stairs", LA),
         N("minecraft:stone_brick_stairs", Lx),
         N("minecraft:stone_brick_stairs", uN)
      );
      N(
         1748,
         N("minecraft:stone_brick_stairs", uQ),
         N("minecraft:stone_brick_stairs", uW),
         N("minecraft:stone_brick_stairs", uT),
         N("minecraft:stone_brick_stairs", un),
         N("minecraft:stone_brick_stairs", ud),
         N("minecraft:stone_brick_stairs", uQ)
      );
      N(
         1749,
         N("minecraft:stone_brick_stairs", uI),
         N("minecraft:stone_brick_stairs", us),
         N("minecraft:stone_brick_stairs", uv),
         N("minecraft:stone_brick_stairs", ul),
         N("minecraft:stone_brick_stairs", uY),
         N("minecraft:stone_brick_stairs", uI)
      );
      N(
         1750,
         N("minecraft:stone_brick_stairs", ug),
         N("minecraft:stone_brick_stairs", uP),
         N("minecraft:stone_brick_stairs", uj),
         N("minecraft:stone_brick_stairs", uG),
         N("minecraft:stone_brick_stairs", uk),
         N("minecraft:stone_brick_stairs", ug)
      );
      N(
         1751,
         N("minecraft:stone_brick_stairs", uO),
         N("minecraft:stone_brick_stairs", um),
         N("minecraft:stone_brick_stairs", ub),
         N("minecraft:stone_brick_stairs", ut),
         N("minecraft:stone_brick_stairs", uw),
         N("minecraft:stone_brick_stairs", uO)
      );
      N(1760, N("minecraft:mycelium", My), N("minecraft:mycelium", My), N("minecraft:mycelium", Map.of("snowy", "true")));
      N(1776, y("minecraft:lily_pad"), y("minecraft:waterlily"));
   }

   private static void i() {
      N(768, y("minecraft:mossy_cobblestone"), y("minecraft:mossy_cobblestone"));
      N(784, y("minecraft:obsidian"), y("minecraft:obsidian"));
      N(801, N("minecraft:wall_torch", NJ), N("minecraft:torch", NJ));
      N(802, N("minecraft:wall_torch", Li), N("minecraft:torch", Li));
      N(803, N("minecraft:wall_torch", yk), N("minecraft:torch", yk));
      N(804, N("minecraft:wall_torch", yu), N("minecraft:torch", yu));
      N(805, y("minecraft:torch"), N("minecraft:torch", yD));
      N(
         816,
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         817,
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         818,
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         819,
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         820,
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         821,
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         822,
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         823,
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         824,
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         825,
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         826,
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         827,
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         828,
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         829,
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         830,
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      N(
         831,
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         N("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
   }

   private static void b() {
      N(3840, N("minecraft:lime_glazed_terracotta", yk), N("minecraft:lime_glazed_terracotta", yk));
      N(3841, N("minecraft:lime_glazed_terracotta", Li), N("minecraft:lime_glazed_terracotta", Li));
      N(3842, N("minecraft:lime_glazed_terracotta", yu), N("minecraft:lime_glazed_terracotta", yu));
      N(3843, N("minecraft:lime_glazed_terracotta", NJ), N("minecraft:lime_glazed_terracotta", NJ));
      N(3856, N("minecraft:pink_glazed_terracotta", yk), N("minecraft:pink_glazed_terracotta", yk));
      N(3857, N("minecraft:pink_glazed_terracotta", Li), N("minecraft:pink_glazed_terracotta", Li));
      N(3858, N("minecraft:pink_glazed_terracotta", yu), N("minecraft:pink_glazed_terracotta", yu));
      N(3859, N("minecraft:pink_glazed_terracotta", NJ), N("minecraft:pink_glazed_terracotta", NJ));
      N(3872, N("minecraft:gray_glazed_terracotta", yk), N("minecraft:gray_glazed_terracotta", yk));
      N(3873, N("minecraft:gray_glazed_terracotta", Li), N("minecraft:gray_glazed_terracotta", Li));
      N(3874, N("minecraft:gray_glazed_terracotta", yu), N("minecraft:gray_glazed_terracotta", yu));
      N(3875, N("minecraft:gray_glazed_terracotta", NJ), N("minecraft:gray_glazed_terracotta", NJ));
      N(3888, N("minecraft:light_gray_glazed_terracotta", yk), N("minecraft:silver_glazed_terracotta", yk));
      N(3889, N("minecraft:light_gray_glazed_terracotta", Li), N("minecraft:silver_glazed_terracotta", Li));
      N(3890, N("minecraft:light_gray_glazed_terracotta", yu), N("minecraft:silver_glazed_terracotta", yu));
      N(3891, N("minecraft:light_gray_glazed_terracotta", NJ), N("minecraft:silver_glazed_terracotta", NJ));
      N(3904, N("minecraft:cyan_glazed_terracotta", yk), N("minecraft:cyan_glazed_terracotta", yk));
      N(3905, N("minecraft:cyan_glazed_terracotta", Li), N("minecraft:cyan_glazed_terracotta", Li));
      N(3906, N("minecraft:cyan_glazed_terracotta", yu), N("minecraft:cyan_glazed_terracotta", yu));
      N(3907, N("minecraft:cyan_glazed_terracotta", NJ), N("minecraft:cyan_glazed_terracotta", NJ));
      N(3920, N("minecraft:purple_glazed_terracotta", yk), N("minecraft:purple_glazed_terracotta", yk));
      N(3921, N("minecraft:purple_glazed_terracotta", Li), N("minecraft:purple_glazed_terracotta", Li));
      N(3922, N("minecraft:purple_glazed_terracotta", yu), N("minecraft:purple_glazed_terracotta", yu));
      N(3923, N("minecraft:purple_glazed_terracotta", NJ), N("minecraft:purple_glazed_terracotta", NJ));
      N(3936, N("minecraft:blue_glazed_terracotta", yk), N("minecraft:blue_glazed_terracotta", yk));
      N(3937, N("minecraft:blue_glazed_terracotta", Li), N("minecraft:blue_glazed_terracotta", Li));
      N(3938, N("minecraft:blue_glazed_terracotta", yu), N("minecraft:blue_glazed_terracotta", yu));
      N(3939, N("minecraft:blue_glazed_terracotta", NJ), N("minecraft:blue_glazed_terracotta", NJ));
      N(3952, N("minecraft:brown_glazed_terracotta", yk), N("minecraft:brown_glazed_terracotta", yk));
      N(3953, N("minecraft:brown_glazed_terracotta", Li), N("minecraft:brown_glazed_terracotta", Li));
      N(3954, N("minecraft:brown_glazed_terracotta", yu), N("minecraft:brown_glazed_terracotta", yu));
      N(3955, N("minecraft:brown_glazed_terracotta", NJ), N("minecraft:brown_glazed_terracotta", NJ));
      N(3968, N("minecraft:green_glazed_terracotta", yk), N("minecraft:green_glazed_terracotta", yk));
      N(3969, N("minecraft:green_glazed_terracotta", Li), N("minecraft:green_glazed_terracotta", Li));
      N(3970, N("minecraft:green_glazed_terracotta", yu), N("minecraft:green_glazed_terracotta", yu));
      N(3971, N("minecraft:green_glazed_terracotta", NJ), N("minecraft:green_glazed_terracotta", NJ));
      N(3984, N("minecraft:red_glazed_terracotta", yk), N("minecraft:red_glazed_terracotta", yk));
      N(3985, N("minecraft:red_glazed_terracotta", Li), N("minecraft:red_glazed_terracotta", Li));
      N(3986, N("minecraft:red_glazed_terracotta", yu), N("minecraft:red_glazed_terracotta", yu));
      N(3987, N("minecraft:red_glazed_terracotta", NJ), N("minecraft:red_glazed_terracotta", NJ));
      N(4000, N("minecraft:black_glazed_terracotta", yk), N("minecraft:black_glazed_terracotta", yk));
      N(4001, N("minecraft:black_glazed_terracotta", Li), N("minecraft:black_glazed_terracotta", Li));
      N(4002, N("minecraft:black_glazed_terracotta", yu), N("minecraft:black_glazed_terracotta", yu));
      N(4003, N("minecraft:black_glazed_terracotta", NJ), N("minecraft:black_glazed_terracotta", NJ));
      N(4016, y("minecraft:white_concrete"), N("minecraft:concrete", Ni));
      N(4017, y("minecraft:orange_concrete"), N("minecraft:concrete", r));
      N(4018, y("minecraft:magenta_concrete"), N("minecraft:concrete", h));
      N(4019, y("minecraft:light_blue_concrete"), N("minecraft:concrete", x));
      N(4020, y("minecraft:yellow_concrete"), N("minecraft:concrete", NR));
      N(4021, y("minecraft:lime_concrete"), N("minecraft:concrete", D));
      N(4022, y("minecraft:pink_concrete"), N("minecraft:concrete", NN));
      N(4023, y("minecraft:gray_concrete"), N("minecraft:concrete", C));
      N(4024, y("minecraft:light_gray_concrete"), N("minecraft:concrete", Nu));
      N(4025, y("minecraft:cyan_concrete"), N("minecraft:concrete", f));
      N(4026, y("minecraft:purple_concrete"), N("minecraft:concrete", Ny));
      N(4027, y("minecraft:blue_concrete"), N("minecraft:concrete", F));
      N(4028, y("minecraft:brown_concrete"), N("minecraft:concrete", A));
      N(4029, y("minecraft:green_concrete"), N("minecraft:concrete", S));
      N(4030, y("minecraft:red_concrete"), N("minecraft:concrete", NL));
      N(4031, y("minecraft:black_concrete"), N("minecraft:concrete", p));
      N(4032, y("minecraft:white_concrete_powder"), N("minecraft:concrete_powder", Ni));
      N(4033, y("minecraft:orange_concrete_powder"), N("minecraft:concrete_powder", r));
      N(4034, y("minecraft:magenta_concrete_powder"), N("minecraft:concrete_powder", h));
      N(4035, y("minecraft:light_blue_concrete_powder"), N("minecraft:concrete_powder", x));
      N(4036, y("minecraft:yellow_concrete_powder"), N("minecraft:concrete_powder", NR));
      N(4037, y("minecraft:lime_concrete_powder"), N("minecraft:concrete_powder", D));
      N(4038, y("minecraft:pink_concrete_powder"), N("minecraft:concrete_powder", NN));
      N(4039, y("minecraft:gray_concrete_powder"), N("minecraft:concrete_powder", C));
      N(4040, y("minecraft:light_gray_concrete_powder"), N("minecraft:concrete_powder", Nu));
      N(4041, y("minecraft:cyan_concrete_powder"), N("minecraft:concrete_powder", f));
      N(4042, y("minecraft:purple_concrete_powder"), N("minecraft:concrete_powder", Ny));
      N(4043, y("minecraft:blue_concrete_powder"), N("minecraft:concrete_powder", F));
      N(4044, y("minecraft:brown_concrete_powder"), N("minecraft:concrete_powder", A));
      N(4045, y("minecraft:green_concrete_powder"), N("minecraft:concrete_powder", S));
      N(4046, y("minecraft:red_concrete_powder"), N("minecraft:concrete_powder", NL));
      N(4047, y("minecraft:black_concrete_powder"), N("minecraft:concrete_powder", p));
      N(4080, N("minecraft:structure_block", Map.of("mode", "save")), N("minecraft:structure_block", Map.of("mode", "save")));
      N(4081, N("minecraft:structure_block", Map.of("mode", "load")), N("minecraft:structure_block", Map.of("mode", "load")));
      N(4082, N("minecraft:structure_block", Map.of("mode", "corner")), N("minecraft:structure_block", Map.of("mode", "corner")));
      N(4083, N("minecraft:structure_block", Map.of("mode", "data")), N("minecraft:structure_block", Map.of("mode", "data")));
   }

   private static void s() {
      N(3328, y("minecraft:grass_path"), y("minecraft:grass_path"));
      N(3344, y("minecraft:end_gateway"), y("minecraft:end_gateway"));
      N(3360, N("minecraft:repeating_command_block", Nk), N("minecraft:repeating_command_block", Nk));
      N(3361, N("minecraft:repeating_command_block", yh), N("minecraft:repeating_command_block", yh));
      N(3362, N("minecraft:repeating_command_block", yi), N("minecraft:repeating_command_block", yi));
      N(3363, N("minecraft:repeating_command_block", yY), N("minecraft:repeating_command_block", yY));
      N(3364, N("minecraft:repeating_command_block", LR), N("minecraft:repeating_command_block", LR));
      N(3365, N("minecraft:repeating_command_block", No), N("minecraft:repeating_command_block", No));
      N(3368, N("minecraft:repeating_command_block", NY), N("minecraft:repeating_command_block", NY));
      N(3369, N("minecraft:repeating_command_block", yr), N("minecraft:repeating_command_block", yr));
      N(3370, N("minecraft:repeating_command_block", yR), N("minecraft:repeating_command_block", yR));
      N(3371, N("minecraft:repeating_command_block", yQ), N("minecraft:repeating_command_block", yQ));
      N(3372, N("minecraft:repeating_command_block", LM), N("minecraft:repeating_command_block", LM));
      N(3373, N("minecraft:repeating_command_block", Nq), N("minecraft:repeating_command_block", Nq));
      N(3376, N("minecraft:chain_command_block", Nk), N("minecraft:chain_command_block", Nk));
      N(3377, N("minecraft:chain_command_block", yh), N("minecraft:chain_command_block", yh));
      N(3378, N("minecraft:chain_command_block", yi), N("minecraft:chain_command_block", yi));
      N(3379, N("minecraft:chain_command_block", yY), N("minecraft:chain_command_block", yY));
      N(3380, N("minecraft:chain_command_block", LR), N("minecraft:chain_command_block", LR));
      N(3381, N("minecraft:chain_command_block", No), N("minecraft:chain_command_block", No));
      N(3384, N("minecraft:chain_command_block", NY), N("minecraft:chain_command_block", NY));
      N(3385, N("minecraft:chain_command_block", yr), N("minecraft:chain_command_block", yr));
      N(3386, N("minecraft:chain_command_block", yR), N("minecraft:chain_command_block", yR));
      N(3387, N("minecraft:chain_command_block", yQ), N("minecraft:chain_command_block", yQ));
      N(3388, N("minecraft:chain_command_block", LM), N("minecraft:chain_command_block", LM));
      N(3389, N("minecraft:chain_command_block", Nq), N("minecraft:chain_command_block", Nq));
      N(3392, N("minecraft:frosted_ice", B), N("minecraft:frosted_ice", B));
      N(3393, N("minecraft:frosted_ice", W), N("minecraft:frosted_ice", W));
      N(3394, N("minecraft:frosted_ice", l), N("minecraft:frosted_ice", l));
      N(3395, N("minecraft:frosted_ice", Q), N("minecraft:frosted_ice", Q));
      N(3408, y("minecraft:magma_block"), y("minecraft:magma"));
      N(3424, y("minecraft:nether_wart_block"), y("minecraft:nether_wart_block"));
      N(3440, y("minecraft:red_nether_bricks"), y("minecraft:red_nether_brick"));
      N(3456, N("minecraft:bone_block", V), N("minecraft:bone_block", V));
      N(3460, N("minecraft:bone_block", K), N("minecraft:bone_block", K));
      N(3464, N("minecraft:bone_block", e), N("minecraft:bone_block", e));
      N(3472, y("minecraft:structure_void"), y("minecraft:structure_void"));
      N(3488, N("minecraft:observer", Ng), N("minecraft:observer", Ng));
      N(3489, N("minecraft:observer", LL), N("minecraft:observer", LL));
      N(3490, N("minecraft:observer", yd), N("minecraft:observer", yd));
      N(3491, N("minecraft:observer", yS), N("minecraft:observer", yS));
      N(3492, N("minecraft:observer", Lw), N("minecraft:observer", Lw));
      N(3493, N("minecraft:observer", yy), N("minecraft:observer", yy));
      N(3496, N("minecraft:observer", NI), N("minecraft:observer", NI));
      N(3497, N("minecraft:observer", Lu), N("minecraft:observer", Lu));
      N(3498, N("minecraft:observer", yw), N("minecraft:observer", yw));
      N(3499, N("minecraft:observer", yx), N("minecraft:observer", yx));
      N(3500, N("minecraft:observer", Lk), N("minecraft:observer", Lk));
      N(3501, N("minecraft:observer", yL), N("minecraft:observer", yL));
      N(3504, N("minecraft:white_shulker_box", Nw), N("minecraft:white_shulker_box", Nw));
      N(3505, N("minecraft:white_shulker_box", yD), N("minecraft:white_shulker_box", yD));
      N(3506, N("minecraft:white_shulker_box", yu), N("minecraft:white_shulker_box", yu));
      N(3507, N("minecraft:white_shulker_box", yk), N("minecraft:white_shulker_box", yk));
      N(3508, N("minecraft:white_shulker_box", Li), N("minecraft:white_shulker_box", Li));
      N(3509, N("minecraft:white_shulker_box", NJ), N("minecraft:white_shulker_box", NJ));
      N(3520, N("minecraft:orange_shulker_box", Nw), N("minecraft:orange_shulker_box", Nw));
      N(3521, N("minecraft:orange_shulker_box", yD), N("minecraft:orange_shulker_box", yD));
      N(3522, N("minecraft:orange_shulker_box", yu), N("minecraft:orange_shulker_box", yu));
      N(3523, N("minecraft:orange_shulker_box", yk), N("minecraft:orange_shulker_box", yk));
      N(3524, N("minecraft:orange_shulker_box", Li), N("minecraft:orange_shulker_box", Li));
      N(3525, N("minecraft:orange_shulker_box", NJ), N("minecraft:orange_shulker_box", NJ));
      N(3536, N("minecraft:magenta_shulker_box", Nw), N("minecraft:magenta_shulker_box", Nw));
      N(3537, N("minecraft:magenta_shulker_box", yD), N("minecraft:magenta_shulker_box", yD));
      N(3538, N("minecraft:magenta_shulker_box", yu), N("minecraft:magenta_shulker_box", yu));
      N(3539, N("minecraft:magenta_shulker_box", yk), N("minecraft:magenta_shulker_box", yk));
      N(3540, N("minecraft:magenta_shulker_box", Li), N("minecraft:magenta_shulker_box", Li));
      N(3541, N("minecraft:magenta_shulker_box", NJ), N("minecraft:magenta_shulker_box", NJ));
      N(3552, N("minecraft:light_blue_shulker_box", Nw), N("minecraft:light_blue_shulker_box", Nw));
      N(3553, N("minecraft:light_blue_shulker_box", yD), N("minecraft:light_blue_shulker_box", yD));
      N(3554, N("minecraft:light_blue_shulker_box", yu), N("minecraft:light_blue_shulker_box", yu));
      N(3555, N("minecraft:light_blue_shulker_box", yk), N("minecraft:light_blue_shulker_box", yk));
      N(3556, N("minecraft:light_blue_shulker_box", Li), N("minecraft:light_blue_shulker_box", Li));
      N(3557, N("minecraft:light_blue_shulker_box", NJ), N("minecraft:light_blue_shulker_box", NJ));
      N(3568, N("minecraft:yellow_shulker_box", Nw), N("minecraft:yellow_shulker_box", Nw));
      N(3569, N("minecraft:yellow_shulker_box", yD), N("minecraft:yellow_shulker_box", yD));
      N(3570, N("minecraft:yellow_shulker_box", yu), N("minecraft:yellow_shulker_box", yu));
      N(3571, N("minecraft:yellow_shulker_box", yk), N("minecraft:yellow_shulker_box", yk));
      N(3572, N("minecraft:yellow_shulker_box", Li), N("minecraft:yellow_shulker_box", Li));
      N(3573, N("minecraft:yellow_shulker_box", NJ), N("minecraft:yellow_shulker_box", NJ));
   }

   private static void m() {
      N(2816, N("minecraft:white_banner", Rw), N("minecraft:standing_banner", Rw));
      N(2817, N("minecraft:white_banner", Rk), N("minecraft:standing_banner", Rk));
      N(2818, N("minecraft:white_banner", Ro), N("minecraft:standing_banner", Ro));
      N(2819, N("minecraft:white_banner", Rq), N("minecraft:standing_banner", Rq));
      N(2820, N("minecraft:white_banner", RK), N("minecraft:standing_banner", RK));
      N(2821, N("minecraft:white_banner", RV), N("minecraft:standing_banner", RV));
      N(2822, N("minecraft:white_banner", Re), N("minecraft:standing_banner", Re));
      N(2823, N("minecraft:white_banner", RH), N("minecraft:standing_banner", RH));
      N(2824, N("minecraft:white_banner", Rc), N("minecraft:standing_banner", Rc));
      N(2825, N("minecraft:white_banner", RX), N("minecraft:standing_banner", RX));
      N(2826, N("minecraft:white_banner", RY), N("minecraft:standing_banner", RY));
      N(2827, N("minecraft:white_banner", RQ), N("minecraft:standing_banner", RQ));
      N(2828, N("minecraft:white_banner", RO), N("minecraft:standing_banner", RO));
      N(2829, N("minecraft:white_banner", Rg), N("minecraft:standing_banner", Rg));
      N(2830, N("minecraft:white_banner", RI), N("minecraft:standing_banner", RI));
      N(2831, N("minecraft:white_banner", RJ), N("minecraft:standing_banner", RJ));
      N(2834, N("minecraft:white_wall_banner", yu), N("minecraft:wall_banner", yu));
      N(2835, N("minecraft:white_wall_banner", yk), N("minecraft:wall_banner", yk));
      N(2836, N("minecraft:white_wall_banner", Li), N("minecraft:wall_banner", Li));
      N(2837, N("minecraft:white_wall_banner", NJ), N("minecraft:wall_banner", NJ));
      N(2848, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "0")), N("minecraft:daylight_detector_inverted", Rz));
      N(2849, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "1")), N("minecraft:daylight_detector_inverted", RU));
      N(2850, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "2")), N("minecraft:daylight_detector_inverted", Rb));
      N(2851, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "3")), N("minecraft:daylight_detector_inverted", Rj));
      N(2852, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "4")), N("minecraft:daylight_detector_inverted", Rv));
      N(2853, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "5")), N("minecraft:daylight_detector_inverted", Rn));
      N(2854, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "6")), N("minecraft:daylight_detector_inverted", Rt));
      N(2855, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "7")), N("minecraft:daylight_detector_inverted", RG));
      N(2856, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "8")), N("minecraft:daylight_detector_inverted", Rl));
      N(2857, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "9")), N("minecraft:daylight_detector_inverted", Rd));
      N(2858, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "10")), N("minecraft:daylight_detector_inverted", RE));
      N(2859, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "11")), N("minecraft:daylight_detector_inverted", RW));
      N(2860, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "12")), N("minecraft:daylight_detector_inverted", Rm));
      N(2861, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "13")), N("minecraft:daylight_detector_inverted", RP));
      N(2862, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "14")), N("minecraft:daylight_detector_inverted", Rs));
      N(2863, N("minecraft:daylight_detector", Map.of("inverted", "true", "power", "15")), N("minecraft:daylight_detector_inverted", RT));
      N(2864, y("minecraft:red_sandstone"), N("minecraft:red_sandstone", Map.of("type", "red_sandstone")));
      N(2865, y("minecraft:chiseled_red_sandstone"), N("minecraft:red_sandstone", Map.of("type", "chiseled_red_sandstone")));
      N(2866, y("minecraft:cut_red_sandstone"), N("minecraft:red_sandstone", Map.of("type", "smooth_red_sandstone")));
      N(
         2880,
         N("minecraft:red_sandstone_stairs", Lr),
         N("minecraft:red_sandstone_stairs", LK),
         N("minecraft:red_sandstone_stairs", Lc),
         N("minecraft:red_sandstone_stairs", LF),
         N("minecraft:red_sandstone_stairs", LS),
         N("minecraft:red_sandstone_stairs", Lr)
      );
      N(
         2881,
         N("minecraft:red_sandstone_stairs", uL),
         N("minecraft:red_sandstone_stairs", LH),
         N("minecraft:red_sandstone_stairs", Lp),
         N("minecraft:red_sandstone_stairs", LC),
         N("minecraft:red_sandstone_stairs", Lh),
         N("minecraft:red_sandstone_stairs", uL)
      );
      N(
         2882,
         N("minecraft:red_sandstone_stairs", uy),
         N("minecraft:red_sandstone_stairs", Le),
         N("minecraft:red_sandstone_stairs", La),
         N("minecraft:red_sandstone_stairs", Lf),
         N("minecraft:red_sandstone_stairs", LD),
         N("minecraft:red_sandstone_stairs", uy)
      );
      N(
         2883,
         N("minecraft:red_sandstone_stairs", uN),
         N("minecraft:red_sandstone_stairs", LV),
         N("minecraft:red_sandstone_stairs", LX),
         N("minecraft:red_sandstone_stairs", LA),
         N("minecraft:red_sandstone_stairs", Lx),
         N("minecraft:red_sandstone_stairs", uN)
      );
      N(
         2884,
         N("minecraft:red_sandstone_stairs", uQ),
         N("minecraft:red_sandstone_stairs", uW),
         N("minecraft:red_sandstone_stairs", uT),
         N("minecraft:red_sandstone_stairs", un),
         N("minecraft:red_sandstone_stairs", ud),
         N("minecraft:red_sandstone_stairs", uQ)
      );
      N(
         2885,
         N("minecraft:red_sandstone_stairs", uI),
         N("minecraft:red_sandstone_stairs", us),
         N("minecraft:red_sandstone_stairs", uv),
         N("minecraft:red_sandstone_stairs", ul),
         N("minecraft:red_sandstone_stairs", uY),
         N("minecraft:red_sandstone_stairs", uI)
      );
      N(
         2886,
         N("minecraft:red_sandstone_stairs", ug),
         N("minecraft:red_sandstone_stairs", uP),
         N("minecraft:red_sandstone_stairs", uj),
         N("minecraft:red_sandstone_stairs", uG),
         N("minecraft:red_sandstone_stairs", uk),
         N("minecraft:red_sandstone_stairs", ug)
      );
      N(
         2887,
         N("minecraft:red_sandstone_stairs", uO),
         N("minecraft:red_sandstone_stairs", um),
         N("minecraft:red_sandstone_stairs", ub),
         N("minecraft:red_sandstone_stairs", ut),
         N("minecraft:red_sandstone_stairs", uw),
         N("minecraft:red_sandstone_stairs", uO)
      );
      N(2896, N("minecraft:red_sandstone_slab", Mb), N("minecraft:double_stone_slab2", Map.of("seamless", "false", "variant", "red_sandstone")));
      N(2904, y("minecraft:smooth_red_sandstone"), N("minecraft:double_stone_slab2", Map.of("seamless", "true", "variant", "red_sandstone")));
      N(2912, N("minecraft:red_sandstone_slab", MT), N("minecraft:stone_slab2", Map.of("half", "bottom", "variant", "red_sandstone")));
      N(2920, N("minecraft:red_sandstone_slab", Mj), N("minecraft:stone_slab2", Map.of("half", "top", "variant", "red_sandstone")));
      N(2928, N("minecraft:spruce_fence_gate", iP), N("minecraft:spruce_fence_gate", iP), N("minecraft:spruce_fence_gate", iG));
      N(2929, N("minecraft:spruce_fence_gate", is), N("minecraft:spruce_fence_gate", is), N("minecraft:spruce_fence_gate", il));
      N(2930, N("minecraft:spruce_fence_gate", im), N("minecraft:spruce_fence_gate", im), N("minecraft:spruce_fence_gate", it));
      N(2931, N("minecraft:spruce_fence_gate", iW), N("minecraft:spruce_fence_gate", iW), N("minecraft:spruce_fence_gate", in));
      N(2932, N("minecraft:spruce_fence_gate", ij), N("minecraft:spruce_fence_gate", ij), N("minecraft:spruce_fence_gate", ik));
      N(2933, N("minecraft:spruce_fence_gate", iv), N("minecraft:spruce_fence_gate", iv), N("minecraft:spruce_fence_gate", iY));
      N(2934, N("minecraft:spruce_fence_gate", ib), N("minecraft:spruce_fence_gate", ib), N("minecraft:spruce_fence_gate", iw));
      N(2935, N("minecraft:spruce_fence_gate", iT), N("minecraft:spruce_fence_gate", iT), N("minecraft:spruce_fence_gate", id));
      N(2936, N("minecraft:spruce_fence_gate", ic), N("minecraft:spruce_fence_gate", ic), N("minecraft:spruce_fence_gate", iS));
      N(2937, N("minecraft:spruce_fence_gate", iX), N("minecraft:spruce_fence_gate", iX), N("minecraft:spruce_fence_gate", ix));
      N(2938, N("minecraft:spruce_fence_gate", iH), N("minecraft:spruce_fence_gate", iH), N("minecraft:spruce_fence_gate", iC));
      N(2939, N("minecraft:spruce_fence_gate", ie), N("minecraft:spruce_fence_gate", ie), N("minecraft:spruce_fence_gate", f_if__1));
      N(2940, N("minecraft:spruce_fence_gate", iF), N("minecraft:spruce_fence_gate", iF), N("minecraft:spruce_fence_gate", ir));
      N(2941, N("minecraft:spruce_fence_gate", iA), N("minecraft:spruce_fence_gate", iA), N("minecraft:spruce_fence_gate", RN));
      N(2942, N("minecraft:spruce_fence_gate", ip), N("minecraft:spruce_fence_gate", ip), N("minecraft:spruce_fence_gate", ih));
      N(2943, N("minecraft:spruce_fence_gate", ia), N("minecraft:spruce_fence_gate", ia), N("minecraft:spruce_fence_gate", iD));
      N(2944, N("minecraft:birch_fence_gate", iP), N("minecraft:birch_fence_gate", iP), N("minecraft:birch_fence_gate", iG));
      N(2945, N("minecraft:birch_fence_gate", is), N("minecraft:birch_fence_gate", is), N("minecraft:birch_fence_gate", il));
      N(2946, N("minecraft:birch_fence_gate", im), N("minecraft:birch_fence_gate", im), N("minecraft:birch_fence_gate", it));
      N(2947, N("minecraft:birch_fence_gate", iW), N("minecraft:birch_fence_gate", iW), N("minecraft:birch_fence_gate", in));
      N(2948, N("minecraft:birch_fence_gate", ij), N("minecraft:birch_fence_gate", ij), N("minecraft:birch_fence_gate", ik));
      N(2949, N("minecraft:birch_fence_gate", iv), N("minecraft:birch_fence_gate", iv), N("minecraft:birch_fence_gate", iY));
      N(2950, N("minecraft:birch_fence_gate", ib), N("minecraft:birch_fence_gate", ib), N("minecraft:birch_fence_gate", iw));
      N(2951, N("minecraft:birch_fence_gate", iT), N("minecraft:birch_fence_gate", iT), N("minecraft:birch_fence_gate", id));
      N(2952, N("minecraft:birch_fence_gate", ic), N("minecraft:birch_fence_gate", ic), N("minecraft:birch_fence_gate", iS));
      N(2953, N("minecraft:birch_fence_gate", iX), N("minecraft:birch_fence_gate", iX), N("minecraft:birch_fence_gate", ix));
      N(2954, N("minecraft:birch_fence_gate", iH), N("minecraft:birch_fence_gate", iH), N("minecraft:birch_fence_gate", iC));
      N(2955, N("minecraft:birch_fence_gate", ie), N("minecraft:birch_fence_gate", ie), N("minecraft:birch_fence_gate", f_if__1));
      N(2956, N("minecraft:birch_fence_gate", iF), N("minecraft:birch_fence_gate", iF), N("minecraft:birch_fence_gate", ir));
      N(2957, N("minecraft:birch_fence_gate", iA), N("minecraft:birch_fence_gate", iA), N("minecraft:birch_fence_gate", RN));
      N(2958, N("minecraft:birch_fence_gate", ip), N("minecraft:birch_fence_gate", ip), N("minecraft:birch_fence_gate", ih));
      N(2959, N("minecraft:birch_fence_gate", ia), N("minecraft:birch_fence_gate", ia), N("minecraft:birch_fence_gate", iD));
      N(2960, N("minecraft:jungle_fence_gate", iP), N("minecraft:jungle_fence_gate", iP), N("minecraft:jungle_fence_gate", iG));
      N(2961, N("minecraft:jungle_fence_gate", is), N("minecraft:jungle_fence_gate", is), N("minecraft:jungle_fence_gate", il));
      N(2962, N("minecraft:jungle_fence_gate", im), N("minecraft:jungle_fence_gate", im), N("minecraft:jungle_fence_gate", it));
      N(2963, N("minecraft:jungle_fence_gate", iW), N("minecraft:jungle_fence_gate", iW), N("minecraft:jungle_fence_gate", in));
      N(2964, N("minecraft:jungle_fence_gate", ij), N("minecraft:jungle_fence_gate", ij), N("minecraft:jungle_fence_gate", ik));
      N(2965, N("minecraft:jungle_fence_gate", iv), N("minecraft:jungle_fence_gate", iv), N("minecraft:jungle_fence_gate", iY));
      N(2966, N("minecraft:jungle_fence_gate", ib), N("minecraft:jungle_fence_gate", ib), N("minecraft:jungle_fence_gate", iw));
      N(2967, N("minecraft:jungle_fence_gate", iT), N("minecraft:jungle_fence_gate", iT), N("minecraft:jungle_fence_gate", id));
      N(2968, N("minecraft:jungle_fence_gate", ic), N("minecraft:jungle_fence_gate", ic), N("minecraft:jungle_fence_gate", iS));
      N(2969, N("minecraft:jungle_fence_gate", iX), N("minecraft:jungle_fence_gate", iX), N("minecraft:jungle_fence_gate", ix));
      N(2970, N("minecraft:jungle_fence_gate", iH), N("minecraft:jungle_fence_gate", iH), N("minecraft:jungle_fence_gate", iC));
      N(2971, N("minecraft:jungle_fence_gate", ie), N("minecraft:jungle_fence_gate", ie), N("minecraft:jungle_fence_gate", f_if__1));
      N(2972, N("minecraft:jungle_fence_gate", iF), N("minecraft:jungle_fence_gate", iF), N("minecraft:jungle_fence_gate", ir));
      N(2973, N("minecraft:jungle_fence_gate", iA), N("minecraft:jungle_fence_gate", iA), N("minecraft:jungle_fence_gate", RN));
      N(2974, N("minecraft:jungle_fence_gate", ip), N("minecraft:jungle_fence_gate", ip), N("minecraft:jungle_fence_gate", ih));
      N(2975, N("minecraft:jungle_fence_gate", ia), N("minecraft:jungle_fence_gate", ia), N("minecraft:jungle_fence_gate", iD));
      N(2976, N("minecraft:dark_oak_fence_gate", iP), N("minecraft:dark_oak_fence_gate", iP), N("minecraft:dark_oak_fence_gate", iG));
      N(2977, N("minecraft:dark_oak_fence_gate", is), N("minecraft:dark_oak_fence_gate", is), N("minecraft:dark_oak_fence_gate", il));
      N(2978, N("minecraft:dark_oak_fence_gate", im), N("minecraft:dark_oak_fence_gate", im), N("minecraft:dark_oak_fence_gate", it));
      N(2979, N("minecraft:dark_oak_fence_gate", iW), N("minecraft:dark_oak_fence_gate", iW), N("minecraft:dark_oak_fence_gate", in));
      N(2980, N("minecraft:dark_oak_fence_gate", ij), N("minecraft:dark_oak_fence_gate", ij), N("minecraft:dark_oak_fence_gate", ik));
      N(2981, N("minecraft:dark_oak_fence_gate", iv), N("minecraft:dark_oak_fence_gate", iv), N("minecraft:dark_oak_fence_gate", iY));
      N(2982, N("minecraft:dark_oak_fence_gate", ib), N("minecraft:dark_oak_fence_gate", ib), N("minecraft:dark_oak_fence_gate", iw));
      N(2983, N("minecraft:dark_oak_fence_gate", iT), N("minecraft:dark_oak_fence_gate", iT), N("minecraft:dark_oak_fence_gate", id));
      N(2984, N("minecraft:dark_oak_fence_gate", ic), N("minecraft:dark_oak_fence_gate", ic), N("minecraft:dark_oak_fence_gate", iS));
      N(2985, N("minecraft:dark_oak_fence_gate", iX), N("minecraft:dark_oak_fence_gate", iX), N("minecraft:dark_oak_fence_gate", ix));
      N(2986, N("minecraft:dark_oak_fence_gate", iH), N("minecraft:dark_oak_fence_gate", iH), N("minecraft:dark_oak_fence_gate", iC));
      N(2987, N("minecraft:dark_oak_fence_gate", ie), N("minecraft:dark_oak_fence_gate", ie), N("minecraft:dark_oak_fence_gate", f_if__1));
      N(2988, N("minecraft:dark_oak_fence_gate", iF), N("minecraft:dark_oak_fence_gate", iF), N("minecraft:dark_oak_fence_gate", ir));
      N(2989, N("minecraft:dark_oak_fence_gate", iA), N("minecraft:dark_oak_fence_gate", iA), N("minecraft:dark_oak_fence_gate", RN));
      N(2990, N("minecraft:dark_oak_fence_gate", ip), N("minecraft:dark_oak_fence_gate", ip), N("minecraft:dark_oak_fence_gate", ih));
      N(2991, N("minecraft:dark_oak_fence_gate", ia), N("minecraft:dark_oak_fence_gate", ia), N("minecraft:dark_oak_fence_gate", iD));
      N(2992, N("minecraft:acacia_fence_gate", iP), N("minecraft:acacia_fence_gate", iP), N("minecraft:acacia_fence_gate", iG));
      N(2993, N("minecraft:acacia_fence_gate", is), N("minecraft:acacia_fence_gate", is), N("minecraft:acacia_fence_gate", il));
      N(2994, N("minecraft:acacia_fence_gate", im), N("minecraft:acacia_fence_gate", im), N("minecraft:acacia_fence_gate", it));
      N(2995, N("minecraft:acacia_fence_gate", iW), N("minecraft:acacia_fence_gate", iW), N("minecraft:acacia_fence_gate", in));
      N(2996, N("minecraft:acacia_fence_gate", ij), N("minecraft:acacia_fence_gate", ij), N("minecraft:acacia_fence_gate", ik));
      N(2997, N("minecraft:acacia_fence_gate", iv), N("minecraft:acacia_fence_gate", iv), N("minecraft:acacia_fence_gate", iY));
      N(2998, N("minecraft:acacia_fence_gate", ib), N("minecraft:acacia_fence_gate", ib), N("minecraft:acacia_fence_gate", iw));
      N(2999, N("minecraft:acacia_fence_gate", iT), N("minecraft:acacia_fence_gate", iT), N("minecraft:acacia_fence_gate", id));
      N(3000, N("minecraft:acacia_fence_gate", ic), N("minecraft:acacia_fence_gate", ic), N("minecraft:acacia_fence_gate", iS));
      N(3001, N("minecraft:acacia_fence_gate", iX), N("minecraft:acacia_fence_gate", iX), N("minecraft:acacia_fence_gate", ix));
      N(3002, N("minecraft:acacia_fence_gate", iH), N("minecraft:acacia_fence_gate", iH), N("minecraft:acacia_fence_gate", iC));
      N(3003, N("minecraft:acacia_fence_gate", ie), N("minecraft:acacia_fence_gate", ie), N("minecraft:acacia_fence_gate", f_if__1));
      N(3004, N("minecraft:acacia_fence_gate", iF), N("minecraft:acacia_fence_gate", iF), N("minecraft:acacia_fence_gate", ir));
      N(3005, N("minecraft:acacia_fence_gate", iA), N("minecraft:acacia_fence_gate", iA), N("minecraft:acacia_fence_gate", RN));
      N(3006, N("minecraft:acacia_fence_gate", ip), N("minecraft:acacia_fence_gate", ip), N("minecraft:acacia_fence_gate", ih));
      N(3007, N("minecraft:acacia_fence_gate", ia), N("minecraft:acacia_fence_gate", ia), N("minecraft:acacia_fence_gate", iD));
      N(
         3008,
         N("minecraft:spruce_fence", Mn),
         N("minecraft:spruce_fence", Mn),
         N("minecraft:spruce_fence", MQ),
         N("minecraft:spruce_fence", MG),
         N("minecraft:spruce_fence", Mg),
         N("minecraft:spruce_fence", Md),
         N("minecraft:spruce_fence", MJ),
         N("minecraft:spruce_fence", Mk),
         N("minecraft:spruce_fence", Mq),
         N("minecraft:spruce_fence", Mt),
         N("minecraft:spruce_fence", MO),
         N("minecraft:spruce_fence", Ml),
         N("minecraft:spruce_fence", MI),
         N("minecraft:spruce_fence", Mw),
         N("minecraft:spruce_fence", Mo),
         N("minecraft:spruce_fence", MY),
         N("minecraft:spruce_fence", MK)
      );
      N(
         3024,
         N("minecraft:birch_fence", Mn),
         N("minecraft:birch_fence", Mn),
         N("minecraft:birch_fence", MQ),
         N("minecraft:birch_fence", MG),
         N("minecraft:birch_fence", Mg),
         N("minecraft:birch_fence", Md),
         N("minecraft:birch_fence", MJ),
         N("minecraft:birch_fence", Mk),
         N("minecraft:birch_fence", Mq),
         N("minecraft:birch_fence", Mt),
         N("minecraft:birch_fence", MO),
         N("minecraft:birch_fence", Ml),
         N("minecraft:birch_fence", MI),
         N("minecraft:birch_fence", Mw),
         N("minecraft:birch_fence", Mo),
         N("minecraft:birch_fence", MY),
         N("minecraft:birch_fence", MK)
      );
      N(
         3040,
         N("minecraft:jungle_fence", Mn),
         N("minecraft:jungle_fence", Mn),
         N("minecraft:jungle_fence", MQ),
         N("minecraft:jungle_fence", MG),
         N("minecraft:jungle_fence", Mg),
         N("minecraft:jungle_fence", Md),
         N("minecraft:jungle_fence", MJ),
         N("minecraft:jungle_fence", Mk),
         N("minecraft:jungle_fence", Mq),
         N("minecraft:jungle_fence", Mt),
         N("minecraft:jungle_fence", MO),
         N("minecraft:jungle_fence", Ml),
         N("minecraft:jungle_fence", MI),
         N("minecraft:jungle_fence", Mw),
         N("minecraft:jungle_fence", Mo),
         N("minecraft:jungle_fence", MY),
         N("minecraft:jungle_fence", MK)
      );
      N(
         3056,
         N("minecraft:dark_oak_fence", Mn),
         N("minecraft:dark_oak_fence", Mn),
         N("minecraft:dark_oak_fence", MQ),
         N("minecraft:dark_oak_fence", MG),
         N("minecraft:dark_oak_fence", Mg),
         N("minecraft:dark_oak_fence", Md),
         N("minecraft:dark_oak_fence", MJ),
         N("minecraft:dark_oak_fence", Mk),
         N("minecraft:dark_oak_fence", Mq),
         N("minecraft:dark_oak_fence", Mt),
         N("minecraft:dark_oak_fence", MO),
         N("minecraft:dark_oak_fence", Ml),
         N("minecraft:dark_oak_fence", MI),
         N("minecraft:dark_oak_fence", Mw),
         N("minecraft:dark_oak_fence", Mo),
         N("minecraft:dark_oak_fence", MY),
         N("minecraft:dark_oak_fence", MK)
      );
   }

   private static void U() {
      N(
         2048,
         N("minecraft:sandstone_stairs", Lr),
         N("minecraft:sandstone_stairs", LK),
         N("minecraft:sandstone_stairs", Lc),
         N("minecraft:sandstone_stairs", LF),
         N("minecraft:sandstone_stairs", LS),
         N("minecraft:sandstone_stairs", Lr)
      );
      N(
         2049,
         N("minecraft:sandstone_stairs", uL),
         N("minecraft:sandstone_stairs", LH),
         N("minecraft:sandstone_stairs", Lp),
         N("minecraft:sandstone_stairs", LC),
         N("minecraft:sandstone_stairs", Lh),
         N("minecraft:sandstone_stairs", uL)
      );
      N(
         2050,
         N("minecraft:sandstone_stairs", uy),
         N("minecraft:sandstone_stairs", Le),
         N("minecraft:sandstone_stairs", La),
         N("minecraft:sandstone_stairs", Lf),
         N("minecraft:sandstone_stairs", LD),
         N("minecraft:sandstone_stairs", uy)
      );
      N(
         2051,
         N("minecraft:sandstone_stairs", uN),
         N("minecraft:sandstone_stairs", LV),
         N("minecraft:sandstone_stairs", LX),
         N("minecraft:sandstone_stairs", LA),
         N("minecraft:sandstone_stairs", Lx),
         N("minecraft:sandstone_stairs", uN)
      );
      N(
         2052,
         N("minecraft:sandstone_stairs", uQ),
         N("minecraft:sandstone_stairs", uW),
         N("minecraft:sandstone_stairs", uT),
         N("minecraft:sandstone_stairs", un),
         N("minecraft:sandstone_stairs", ud),
         N("minecraft:sandstone_stairs", uQ)
      );
      N(
         2053,
         N("minecraft:sandstone_stairs", uI),
         N("minecraft:sandstone_stairs", us),
         N("minecraft:sandstone_stairs", uv),
         N("minecraft:sandstone_stairs", ul),
         N("minecraft:sandstone_stairs", uY),
         N("minecraft:sandstone_stairs", uI)
      );
      N(
         2054,
         N("minecraft:sandstone_stairs", ug),
         N("minecraft:sandstone_stairs", uP),
         N("minecraft:sandstone_stairs", uj),
         N("minecraft:sandstone_stairs", uG),
         N("minecraft:sandstone_stairs", uk),
         N("minecraft:sandstone_stairs", ug)
      );
      N(
         2055,
         N("minecraft:sandstone_stairs", uO),
         N("minecraft:sandstone_stairs", um),
         N("minecraft:sandstone_stairs", ub),
         N("minecraft:sandstone_stairs", ut),
         N("minecraft:sandstone_stairs", uw),
         N("minecraft:sandstone_stairs", uO)
      );
      N(2064, y("minecraft:emerald_ore"), y("minecraft:emerald_ore"));
      N(2082, N("minecraft:ender_chest", yu), N("minecraft:ender_chest", yu));
      N(2083, N("minecraft:ender_chest", yk), N("minecraft:ender_chest", yk));
      N(2084, N("minecraft:ender_chest", Li), N("minecraft:ender_chest", Li));
      N(2085, N("minecraft:ender_chest", NJ), N("minecraft:ender_chest", NJ));
      N(
         2096,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "false"))
      );
      N(
         2097,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "false"))
      );
      N(
         2098,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "false"))
      );
      N(
         2099,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "false"))
      );
      N(
         2100,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "false"))
      );
      N(
         2101,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "false"))
      );
      N(
         2102,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "false"))
      );
      N(
         2103,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "false")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "false"))
      );
      N(
         2104,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "true"))
      );
      N(
         2105,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "true"))
      );
      N(
         2106,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "true"))
      );
      N(
         2107,
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "true"))
      );
      N(
         2108,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "true"))
      );
      N(
         2109,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "true"))
      );
      N(
         2110,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "true"))
      );
      N(
         2111,
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "true")),
         N("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "true"))
      );
      N(
         2112,
         N("minecraft:tripwire", NM),
         N("minecraft:tripwire", NM),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      N(
         2113,
         N("minecraft:tripwire", NB),
         N("minecraft:tripwire", NB),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      N(2114, N("minecraft:tripwire", NM));
      N(2115, N("minecraft:tripwire", NB));
      N(
         2116,
         N("minecraft:tripwire", NU),
         N("minecraft:tripwire", NU),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      N(
         2117,
         N("minecraft:tripwire", NE),
         N("minecraft:tripwire", NE),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      N(2118, N("minecraft:tripwire", NU));
      N(2119, N("minecraft:tripwire", NE));
      N(
         2120,
         N("minecraft:tripwire", NZ),
         N("minecraft:tripwire", NZ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      N(
         2121,
         N("minecraft:tripwire", Nz),
         N("minecraft:tripwire", Nz),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      N(2122, N("minecraft:tripwire", NZ));
      N(2123, N("minecraft:tripwire", Nz));
      N(
         2124,
         N("minecraft:tripwire", NW),
         N("minecraft:tripwire", NW),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      N(
         2125,
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         N(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      N(2126, N("minecraft:tripwire", NW));
      N(2128, y("minecraft:emerald_block"), y("minecraft:emerald_block"));
      N(
         2144,
         N("minecraft:spruce_stairs", Lr),
         N("minecraft:spruce_stairs", LK),
         N("minecraft:spruce_stairs", Lc),
         N("minecraft:spruce_stairs", LF),
         N("minecraft:spruce_stairs", LS),
         N("minecraft:spruce_stairs", Lr)
      );
      N(
         2145,
         N("minecraft:spruce_stairs", uL),
         N("minecraft:spruce_stairs", LH),
         N("minecraft:spruce_stairs", Lp),
         N("minecraft:spruce_stairs", LC),
         N("minecraft:spruce_stairs", Lh),
         N("minecraft:spruce_stairs", uL)
      );
      N(
         2146,
         N("minecraft:spruce_stairs", uy),
         N("minecraft:spruce_stairs", Le),
         N("minecraft:spruce_stairs", La),
         N("minecraft:spruce_stairs", Lf),
         N("minecraft:spruce_stairs", LD),
         N("minecraft:spruce_stairs", uy)
      );
      N(
         2147,
         N("minecraft:spruce_stairs", uN),
         N("minecraft:spruce_stairs", LV),
         N("minecraft:spruce_stairs", LX),
         N("minecraft:spruce_stairs", LA),
         N("minecraft:spruce_stairs", Lx),
         N("minecraft:spruce_stairs", uN)
      );
      N(
         2148,
         N("minecraft:spruce_stairs", uQ),
         N("minecraft:spruce_stairs", uW),
         N("minecraft:spruce_stairs", uT),
         N("minecraft:spruce_stairs", un),
         N("minecraft:spruce_stairs", ud),
         N("minecraft:spruce_stairs", uQ)
      );
      N(
         2149,
         N("minecraft:spruce_stairs", uI),
         N("minecraft:spruce_stairs", us),
         N("minecraft:spruce_stairs", uv),
         N("minecraft:spruce_stairs", ul),
         N("minecraft:spruce_stairs", uY),
         N("minecraft:spruce_stairs", uI)
      );
      N(
         2150,
         N("minecraft:spruce_stairs", ug),
         N("minecraft:spruce_stairs", uP),
         N("minecraft:spruce_stairs", uj),
         N("minecraft:spruce_stairs", uG),
         N("minecraft:spruce_stairs", uk),
         N("minecraft:spruce_stairs", ug)
      );
      N(
         2151,
         N("minecraft:spruce_stairs", uO),
         N("minecraft:spruce_stairs", um),
         N("minecraft:spruce_stairs", ub),
         N("minecraft:spruce_stairs", ut),
         N("minecraft:spruce_stairs", uw),
         N("minecraft:spruce_stairs", uO)
      );
      N(
         2160,
         N("minecraft:birch_stairs", Lr),
         N("minecraft:birch_stairs", LK),
         N("minecraft:birch_stairs", Lc),
         N("minecraft:birch_stairs", LF),
         N("minecraft:birch_stairs", LS),
         N("minecraft:birch_stairs", Lr)
      );
      N(
         2161,
         N("minecraft:birch_stairs", uL),
         N("minecraft:birch_stairs", LH),
         N("minecraft:birch_stairs", Lp),
         N("minecraft:birch_stairs", LC),
         N("minecraft:birch_stairs", Lh),
         N("minecraft:birch_stairs", uL)
      );
      N(
         2162,
         N("minecraft:birch_stairs", uy),
         N("minecraft:birch_stairs", Le),
         N("minecraft:birch_stairs", La),
         N("minecraft:birch_stairs", Lf),
         N("minecraft:birch_stairs", LD),
         N("minecraft:birch_stairs", uy)
      );
      N(
         2163,
         N("minecraft:birch_stairs", uN),
         N("minecraft:birch_stairs", LV),
         N("minecraft:birch_stairs", LX),
         N("minecraft:birch_stairs", LA),
         N("minecraft:birch_stairs", Lx),
         N("minecraft:birch_stairs", uN)
      );
      N(
         2164,
         N("minecraft:birch_stairs", uQ),
         N("minecraft:birch_stairs", uW),
         N("minecraft:birch_stairs", uT),
         N("minecraft:birch_stairs", un),
         N("minecraft:birch_stairs", ud),
         N("minecraft:birch_stairs", uQ)
      );
      N(
         2165,
         N("minecraft:birch_stairs", uI),
         N("minecraft:birch_stairs", us),
         N("minecraft:birch_stairs", uv),
         N("minecraft:birch_stairs", ul),
         N("minecraft:birch_stairs", uY),
         N("minecraft:birch_stairs", uI)
      );
      N(
         2166,
         N("minecraft:birch_stairs", ug),
         N("minecraft:birch_stairs", uP),
         N("minecraft:birch_stairs", uj),
         N("minecraft:birch_stairs", uG),
         N("minecraft:birch_stairs", uk),
         N("minecraft:birch_stairs", ug)
      );
      N(
         2167,
         N("minecraft:birch_stairs", uO),
         N("minecraft:birch_stairs", um),
         N("minecraft:birch_stairs", ub),
         N("minecraft:birch_stairs", ut),
         N("minecraft:birch_stairs", uw),
         N("minecraft:birch_stairs", uO)
      );
      N(
         2176,
         N("minecraft:jungle_stairs", Lr),
         N("minecraft:jungle_stairs", LK),
         N("minecraft:jungle_stairs", Lc),
         N("minecraft:jungle_stairs", LF),
         N("minecraft:jungle_stairs", LS),
         N("minecraft:jungle_stairs", Lr)
      );
      N(
         2177,
         N("minecraft:jungle_stairs", uL),
         N("minecraft:jungle_stairs", LH),
         N("minecraft:jungle_stairs", Lp),
         N("minecraft:jungle_stairs", LC),
         N("minecraft:jungle_stairs", Lh),
         N("minecraft:jungle_stairs", uL)
      );
      N(
         2178,
         N("minecraft:jungle_stairs", uy),
         N("minecraft:jungle_stairs", Le),
         N("minecraft:jungle_stairs", La),
         N("minecraft:jungle_stairs", Lf),
         N("minecraft:jungle_stairs", LD),
         N("minecraft:jungle_stairs", uy)
      );
      N(
         2179,
         N("minecraft:jungle_stairs", uN),
         N("minecraft:jungle_stairs", LV),
         N("minecraft:jungle_stairs", LX),
         N("minecraft:jungle_stairs", LA),
         N("minecraft:jungle_stairs", Lx),
         N("minecraft:jungle_stairs", uN)
      );
      N(
         2180,
         N("minecraft:jungle_stairs", uQ),
         N("minecraft:jungle_stairs", uW),
         N("minecraft:jungle_stairs", uT),
         N("minecraft:jungle_stairs", un),
         N("minecraft:jungle_stairs", ud),
         N("minecraft:jungle_stairs", uQ)
      );
      N(
         2181,
         N("minecraft:jungle_stairs", uI),
         N("minecraft:jungle_stairs", us),
         N("minecraft:jungle_stairs", uv),
         N("minecraft:jungle_stairs", ul),
         N("minecraft:jungle_stairs", uY),
         N("minecraft:jungle_stairs", uI)
      );
      N(
         2182,
         N("minecraft:jungle_stairs", ug),
         N("minecraft:jungle_stairs", uP),
         N("minecraft:jungle_stairs", uj),
         N("minecraft:jungle_stairs", uG),
         N("minecraft:jungle_stairs", uk),
         N("minecraft:jungle_stairs", ug)
      );
      N(
         2183,
         N("minecraft:jungle_stairs", uO),
         N("minecraft:jungle_stairs", um),
         N("minecraft:jungle_stairs", ub),
         N("minecraft:jungle_stairs", ut),
         N("minecraft:jungle_stairs", uw),
         N("minecraft:jungle_stairs", uO)
      );
      N(2192, N("minecraft:command_block", Nk), N("minecraft:command_block", Nk));
      N(2193, N("minecraft:command_block", yh), N("minecraft:command_block", yh));
      N(2194, N("minecraft:command_block", yi), N("minecraft:command_block", yi));
      N(2195, N("minecraft:command_block", yY), N("minecraft:command_block", yY));
      N(2196, N("minecraft:command_block", LR), N("minecraft:command_block", LR));
      N(2197, N("minecraft:command_block", No), N("minecraft:command_block", No));
      N(2200, N("minecraft:command_block", NY), N("minecraft:command_block", NY));
      N(2201, N("minecraft:command_block", yr), N("minecraft:command_block", yr));
      N(2202, N("minecraft:command_block", yR), N("minecraft:command_block", yR));
      N(2203, N("minecraft:command_block", yQ), N("minecraft:command_block", yQ));
      N(2204, N("minecraft:command_block", LM), N("minecraft:command_block", LM));
      N(2205, N("minecraft:command_block", Nq), N("minecraft:command_block", Nq));
      N(2208, y("minecraft:beacon"), y("minecraft:beacon"));
      N(
         2224,
         N("minecraft:cobblestone_wall", Mv),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "true"))
      );
      N(
         2225,
         N("minecraft:mossy_cobblestone_wall", Mv),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         N(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         N("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true"))
      );
      N(
         2240,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "0")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "0"))
      );
      N(
         2241,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "1")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "1"))
      );
      N(
         2242,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "2")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "2"))
      );
      N(
         2243,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "3")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "3"))
      );
      N(
         2244,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "4")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "4"))
      );
      N(
         2245,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "5")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "5"))
      );
      N(
         2246,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "6")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "6"))
      );
      N(
         2247,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "7")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "7"))
      );
      N(
         2248,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "8")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "8"))
      );
      N(
         2249,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "9")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "9"))
      );
      N(
         2250,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "10")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "10"))
      );
      N(
         2251,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "11")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "11"))
      );
      N(
         2252,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "12")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "12"))
      );
      N(
         2253,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "13")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "13"))
      );
      N(
         2254,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "14")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "14"))
      );
      N(
         2255,
         y("minecraft:potted_cactus"),
         N("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "15")),
         N("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "15"))
      );
      N(2256, N("minecraft:carrots", B), N("minecraft:carrots", B));
      N(2257, N("minecraft:carrots", W), N("minecraft:carrots", W));
      N(2258, N("minecraft:carrots", l), N("minecraft:carrots", l));
      N(2259, N("minecraft:carrots", Q), N("minecraft:carrots", Q));
      N(2260, N("minecraft:carrots", O), N("minecraft:carrots", O));
      N(2261, N("minecraft:carrots", g), N("minecraft:carrots", g));
      N(2262, N("minecraft:carrots", I), N("minecraft:carrots", I));
      N(2263, N("minecraft:carrots", J), N("minecraft:carrots", J));
      N(2272, N("minecraft:potatoes", B), N("minecraft:potatoes", B));
      N(2273, N("minecraft:potatoes", W), N("minecraft:potatoes", W));
      N(2274, N("minecraft:potatoes", l), N("minecraft:potatoes", l));
      N(2275, N("minecraft:potatoes", Q), N("minecraft:potatoes", Q));
      N(2276, N("minecraft:potatoes", O), N("minecraft:potatoes", O));
      N(2277, N("minecraft:potatoes", g), N("minecraft:potatoes", g));
      N(2278, N("minecraft:potatoes", I), N("minecraft:potatoes", I));
      N(2279, N("minecraft:potatoes", J), N("minecraft:potatoes", J));
      N(2288, N("minecraft:oak_button", Nm), N("minecraft:wooden_button", Ng));
      N(2289, N("minecraft:oak_button", Nb), N("minecraft:wooden_button", yy));
      N(2290, N("minecraft:oak_button", Nn), N("minecraft:wooden_button", Lw));
      N(2291, N("minecraft:oak_button", Nv), N("minecraft:wooden_button", yS));
      N(2292, N("minecraft:oak_button", Nj), N("minecraft:wooden_button", yd));
      N(2293, N("minecraft:oak_button", Ns), N("minecraft:wooden_button", LL));
      N(2296, N("minecraft:oak_button", NP), N("minecraft:wooden_button", NI));
      N(2297, N("minecraft:oak_button", Nt), N("minecraft:wooden_button", yL));
      N(2298, N("minecraft:oak_button", Nd), N("minecraft:wooden_button", Lk));
      N(2299, N("minecraft:oak_button", Nl), N("minecraft:wooden_button", yx));
      N(2300, N("minecraft:oak_button", NG), N("minecraft:wooden_button", yw));
      N(2301, N("minecraft:oak_button", NT), N("minecraft:wooden_button", Lu));
   }

   private static void z() {
      N(1792, y("minecraft:nether_bricks"), y("minecraft:nether_brick"));
      N(
         1808,
         N("minecraft:nether_brick_fence", Mn),
         N("minecraft:nether_brick_fence", Mn),
         N("minecraft:nether_brick_fence", MQ),
         N("minecraft:nether_brick_fence", MG),
         N("minecraft:nether_brick_fence", Mg),
         N("minecraft:nether_brick_fence", Md),
         N("minecraft:nether_brick_fence", MJ),
         N("minecraft:nether_brick_fence", Mk),
         N("minecraft:nether_brick_fence", Mq),
         N("minecraft:nether_brick_fence", Mt),
         N("minecraft:nether_brick_fence", MO),
         N("minecraft:nether_brick_fence", Ml),
         N("minecraft:nether_brick_fence", MI),
         N("minecraft:nether_brick_fence", Mw),
         N("minecraft:nether_brick_fence", Mo),
         N("minecraft:nether_brick_fence", MY),
         N("minecraft:nether_brick_fence", MK)
      );
      N(
         1824,
         N("minecraft:nether_brick_stairs", Lr),
         N("minecraft:nether_brick_stairs", LK),
         N("minecraft:nether_brick_stairs", Lc),
         N("minecraft:nether_brick_stairs", LF),
         N("minecraft:nether_brick_stairs", LS),
         N("minecraft:nether_brick_stairs", Lr)
      );
      N(
         1825,
         N("minecraft:nether_brick_stairs", uL),
         N("minecraft:nether_brick_stairs", LH),
         N("minecraft:nether_brick_stairs", Lp),
         N("minecraft:nether_brick_stairs", LC),
         N("minecraft:nether_brick_stairs", Lh),
         N("minecraft:nether_brick_stairs", uL)
      );
      N(
         1826,
         N("minecraft:nether_brick_stairs", uy),
         N("minecraft:nether_brick_stairs", Le),
         N("minecraft:nether_brick_stairs", La),
         N("minecraft:nether_brick_stairs", Lf),
         N("minecraft:nether_brick_stairs", LD),
         N("minecraft:nether_brick_stairs", uy)
      );
      N(
         1827,
         N("minecraft:nether_brick_stairs", uN),
         N("minecraft:nether_brick_stairs", LV),
         N("minecraft:nether_brick_stairs", LX),
         N("minecraft:nether_brick_stairs", LA),
         N("minecraft:nether_brick_stairs", Lx),
         N("minecraft:nether_brick_stairs", uN)
      );
      N(
         1828,
         N("minecraft:nether_brick_stairs", uQ),
         N("minecraft:nether_brick_stairs", uW),
         N("minecraft:nether_brick_stairs", uT),
         N("minecraft:nether_brick_stairs", un),
         N("minecraft:nether_brick_stairs", ud),
         N("minecraft:nether_brick_stairs", uQ)
      );
      N(
         1829,
         N("minecraft:nether_brick_stairs", uI),
         N("minecraft:nether_brick_stairs", us),
         N("minecraft:nether_brick_stairs", uv),
         N("minecraft:nether_brick_stairs", ul),
         N("minecraft:nether_brick_stairs", uY),
         N("minecraft:nether_brick_stairs", uI)
      );
      N(
         1830,
         N("minecraft:nether_brick_stairs", ug),
         N("minecraft:nether_brick_stairs", uP),
         N("minecraft:nether_brick_stairs", uj),
         N("minecraft:nether_brick_stairs", uG),
         N("minecraft:nether_brick_stairs", uk),
         N("minecraft:nether_brick_stairs", ug)
      );
      N(
         1831,
         N("minecraft:nether_brick_stairs", uO),
         N("minecraft:nether_brick_stairs", um),
         N("minecraft:nether_brick_stairs", ub),
         N("minecraft:nether_brick_stairs", ut),
         N("minecraft:nether_brick_stairs", uw),
         N("minecraft:nether_brick_stairs", uO)
      );
      N(1840, N("minecraft:nether_wart", B), N("minecraft:nether_wart", B));
      N(1841, N("minecraft:nether_wart", W), N("minecraft:nether_wart", W));
      N(1842, N("minecraft:nether_wart", l), N("minecraft:nether_wart", l));
      N(1843, N("minecraft:nether_wart", Q), N("minecraft:nether_wart", Q));
      N(1856, y("minecraft:enchanting_table"), y("minecraft:enchanting_table"));
      N(
         1872,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "false")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "false"))
      );
      N(
         1873,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "false")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "false"))
      );
      N(
         1874,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "false")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "false"))
      );
      N(
         1875,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "false")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "false"))
      );
      N(
         1876,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "true")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "true"))
      );
      N(
         1877,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "true")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "true"))
      );
      N(
         1878,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "true")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "true"))
      );
      N(
         1879,
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "true")),
         N("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "true"))
      );
      N(1888, N("minecraft:cauldron", uo), N("minecraft:cauldron", uo));
      N(1889, N("minecraft:cauldron", uq), N("minecraft:cauldron", uq));
      N(1890, N("minecraft:cauldron", ua), N("minecraft:cauldron", ua));
      N(1891, N("minecraft:cauldron", up), N("minecraft:cauldron", up));
      N(1904, y("minecraft:end_portal"), y("minecraft:end_portal"));
      N(
         1920,
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "south")),
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "south"))
      );
      N(
         1921,
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "west")),
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "west"))
      );
      N(
         1922,
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "north")),
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "north"))
      );
      N(
         1923,
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "east")),
         N("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "east"))
      );
      N(
         1924,
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "south")),
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "south"))
      );
      N(
         1925,
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "west")),
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "west"))
      );
      N(
         1926,
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "north")),
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "north"))
      );
      N(
         1927,
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "east")),
         N("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "east"))
      );
      N(1936, y("minecraft:end_stone"), y("minecraft:end_stone"));
      N(1952, y("minecraft:dragon_egg"), y("minecraft:dragon_egg"));
      N(1968, N("minecraft:redstone_lamp", uD), y("minecraft:redstone_lamp"));
      N(1984, N("minecraft:redstone_lamp", uh), y("minecraft:lit_redstone_lamp"));
      N(2000, N("minecraft:oak_slab", Mb), N("minecraft:double_wooden_slab", Map.of("variant", "oak")));
      N(2001, N("minecraft:spruce_slab", Mb), N("minecraft:double_wooden_slab", Map.of("variant", "spruce")));
      N(2002, N("minecraft:birch_slab", Mb), N("minecraft:double_wooden_slab", Map.of("variant", "birch")));
      N(2003, N("minecraft:jungle_slab", Mb), N("minecraft:double_wooden_slab", Map.of("variant", "jungle")));
      N(2004, N("minecraft:acacia_slab", Mb), N("minecraft:double_wooden_slab", Map.of("variant", "acacia")));
      N(2005, N("minecraft:dark_oak_slab", Mb), N("minecraft:double_wooden_slab", Map.of("variant", "dark_oak")));
      N(2016, N("minecraft:oak_slab", MT), N("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "oak")));
      N(2017, N("minecraft:spruce_slab", MT), N("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "spruce")));
      N(2018, N("minecraft:birch_slab", MT), N("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "birch")));
      N(2019, N("minecraft:jungle_slab", MT), N("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "jungle")));
      N(2020, N("minecraft:acacia_slab", MT), N("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "acacia")));
      N(2021, N("minecraft:dark_oak_slab", MT), N("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "dark_oak")));
      N(2024, N("minecraft:oak_slab", Mj), N("minecraft:wooden_slab", Map.of("half", "top", "variant", "oak")));
      N(2025, N("minecraft:spruce_slab", Mj), N("minecraft:wooden_slab", Map.of("half", "top", "variant", "spruce")));
      N(2026, N("minecraft:birch_slab", Mj), N("minecraft:wooden_slab", Map.of("half", "top", "variant", "birch")));
      N(2027, N("minecraft:jungle_slab", Mj), N("minecraft:wooden_slab", Map.of("half", "top", "variant", "jungle")));
      N(2028, N("minecraft:acacia_slab", Mj), N("minecraft:wooden_slab", Map.of("half", "top", "variant", "acacia")));
      N(2029, N("minecraft:dark_oak_slab", Mj), N("minecraft:wooden_slab", Map.of("half", "top", "variant", "dark_oak")));
      N(2032, N("minecraft:cocoa", U), N("minecraft:cocoa", U));
      N(2033, N("minecraft:cocoa", E), N("minecraft:cocoa", E));
      N(2034, N("minecraft:cocoa", z), N("minecraft:cocoa", z));
      N(2035, N("minecraft:cocoa", Z), N("minecraft:cocoa", Z));
      N(2036, N("minecraft:cocoa", t), N("minecraft:cocoa", t));
      N(2037, N("minecraft:cocoa", G), N("minecraft:cocoa", G));
      N(2038, N("minecraft:cocoa", n), N("minecraft:cocoa", n));
      N(2039, N("minecraft:cocoa", v), N("minecraft:cocoa", v));
      N(2040, N("minecraft:cocoa", k), N("minecraft:cocoa", k));
      N(2041, N("minecraft:cocoa", Y), N("minecraft:cocoa", Y));
      N(2042, N("minecraft:cocoa", w), N("minecraft:cocoa", w));
      N(2043, N("minecraft:cocoa", d), N("minecraft:cocoa", d));
   }

   private static void u() {
      N(512, y("minecraft:dead_bush"), y("minecraft:deadbush"));
      N(528, N("minecraft:piston", NQ), N("minecraft:piston", NQ));
      N(529, N("minecraft:piston", LN), N("minecraft:piston", LN));
      N(530, N("minecraft:piston", yM), N("minecraft:piston", yM));
      N(531, N("minecraft:piston", yO), N("minecraft:piston", yO));
      N(532, N("minecraft:piston", LB), N("minecraft:piston", LB));
      N(533, N("minecraft:piston", NK), N("minecraft:piston", NK));
      N(536, N("minecraft:piston", NO), N("minecraft:piston", NO));
      N(537, N("minecraft:piston", Ly), N("minecraft:piston", Ly));
      N(538, N("minecraft:piston", yB), N("minecraft:piston", yB));
      N(539, N("minecraft:piston", yg), N("minecraft:piston", yg));
      N(540, N("minecraft:piston", LZ), N("minecraft:piston", LZ));
      N(541, N("minecraft:piston", NV), N("minecraft:piston", NV));
      N(
         544,
         N("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "down", "short", "true", "type", "normal"))
      );
      N(
         545,
         N("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "up", "short", "true", "type", "normal"))
      );
      N(
         546,
         N("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "north", "short", "true", "type", "normal"))
      );
      N(
         547,
         N("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "south", "short", "true", "type", "normal"))
      );
      N(
         548,
         N("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "west", "short", "true", "type", "normal"))
      );
      N(
         549,
         N("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "normal")),
         N("minecraft:piston_head", Map.of("facing", "east", "short", "true", "type", "normal"))
      );
      N(
         552,
         N("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "down", "short", "true", "type", "sticky"))
      );
      N(
         553,
         N("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "up", "short", "true", "type", "sticky"))
      );
      N(
         554,
         N("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "north", "short", "true", "type", "sticky"))
      );
      N(
         555,
         N("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "south", "short", "true", "type", "sticky"))
      );
      N(
         556,
         N("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "west", "short", "true", "type", "sticky"))
      );
      N(
         557,
         N("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "sticky")),
         N("minecraft:piston_head", Map.of("facing", "east", "short", "true", "type", "sticky"))
      );
      N(560, y("minecraft:white_wool"), N("minecraft:wool", Ni));
      N(561, y("minecraft:orange_wool"), N("minecraft:wool", r));
      N(562, y("minecraft:magenta_wool"), N("minecraft:wool", h));
      N(563, y("minecraft:light_blue_wool"), N("minecraft:wool", x));
      N(564, y("minecraft:yellow_wool"), N("minecraft:wool", NR));
      N(565, y("minecraft:lime_wool"), N("minecraft:wool", D));
      N(566, y("minecraft:pink_wool"), N("minecraft:wool", NN));
      N(567, y("minecraft:gray_wool"), N("minecraft:wool", C));
      N(568, y("minecraft:light_gray_wool"), N("minecraft:wool", Nu));
      N(569, y("minecraft:cyan_wool"), N("minecraft:wool", f));
      N(570, y("minecraft:purple_wool"), N("minecraft:wool", Ny));
      N(571, y("minecraft:blue_wool"), N("minecraft:wool", F));
      N(572, y("minecraft:brown_wool"), N("minecraft:wool", A));
      N(573, y("minecraft:green_wool"), N("minecraft:wool", S));
      N(574, y("minecraft:red_wool"), N("minecraft:wool", NL));
      N(575, y("minecraft:black_wool"), N("minecraft:wool", p));
      N(
         576,
         N("minecraft:moving_piston", Map.of("facing", "down", "type", "normal")),
         N("minecraft:piston_extension", Map.of("facing", "down", "type", "normal"))
      );
      N(577, N("minecraft:moving_piston", Map.of("facing", "up", "type", "normal")), N("minecraft:piston_extension", Map.of("facing", "up", "type", "normal")));
      N(
         578,
         N("minecraft:moving_piston", Map.of("facing", "north", "type", "normal")),
         N("minecraft:piston_extension", Map.of("facing", "north", "type", "normal"))
      );
      N(
         579,
         N("minecraft:moving_piston", Map.of("facing", "south", "type", "normal")),
         N("minecraft:piston_extension", Map.of("facing", "south", "type", "normal"))
      );
      N(
         580,
         N("minecraft:moving_piston", Map.of("facing", "west", "type", "normal")),
         N("minecraft:piston_extension", Map.of("facing", "west", "type", "normal"))
      );
      N(
         581,
         N("minecraft:moving_piston", Map.of("facing", "east", "type", "normal")),
         N("minecraft:piston_extension", Map.of("facing", "east", "type", "normal"))
      );
      N(
         584,
         N("minecraft:moving_piston", Map.of("facing", "down", "type", "sticky")),
         N("minecraft:piston_extension", Map.of("facing", "down", "type", "sticky"))
      );
      N(585, N("minecraft:moving_piston", Map.of("facing", "up", "type", "sticky")), N("minecraft:piston_extension", Map.of("facing", "up", "type", "sticky")));
      N(
         586,
         N("minecraft:moving_piston", Map.of("facing", "north", "type", "sticky")),
         N("minecraft:piston_extension", Map.of("facing", "north", "type", "sticky"))
      );
      N(
         587,
         N("minecraft:moving_piston", Map.of("facing", "south", "type", "sticky")),
         N("minecraft:piston_extension", Map.of("facing", "south", "type", "sticky"))
      );
      N(
         588,
         N("minecraft:moving_piston", Map.of("facing", "west", "type", "sticky")),
         N("minecraft:piston_extension", Map.of("facing", "west", "type", "sticky"))
      );
      N(
         589,
         N("minecraft:moving_piston", Map.of("facing", "east", "type", "sticky")),
         N("minecraft:piston_extension", Map.of("facing", "east", "type", "sticky"))
      );
      N(592, y("minecraft:dandelion"), N("minecraft:yellow_flower", Map.of("type", "dandelion")));
      N(608, y("minecraft:poppy"), N("minecraft:red_flower", Map.of("type", "poppy")));
      N(609, y("minecraft:blue_orchid"), N("minecraft:red_flower", Map.of("type", "blue_orchid")));
      N(610, y("minecraft:allium"), N("minecraft:red_flower", Map.of("type", "allium")));
      N(611, y("minecraft:azure_bluet"), N("minecraft:red_flower", Map.of("type", "houstonia")));
      N(612, y("minecraft:red_tulip"), N("minecraft:red_flower", Map.of("type", "red_tulip")));
      N(613, y("minecraft:orange_tulip"), N("minecraft:red_flower", Map.of("type", "orange_tulip")));
      N(614, y("minecraft:white_tulip"), N("minecraft:red_flower", Map.of("type", "white_tulip")));
      N(615, y("minecraft:pink_tulip"), N("minecraft:red_flower", Map.of("type", "pink_tulip")));
      N(616, y("minecraft:oxeye_daisy"), N("minecraft:red_flower", Map.of("type", "oxeye_daisy")));
      N(624, y("minecraft:brown_mushroom"), y("minecraft:brown_mushroom"));
      N(640, y("minecraft:red_mushroom"), y("minecraft:red_mushroom"));
      N(656, y("minecraft:gold_block"), y("minecraft:gold_block"));
      N(672, y("minecraft:iron_block"), y("minecraft:iron_block"));
      N(688, N("minecraft:stone_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "stone")));
      N(689, N("minecraft:sandstone_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "sandstone")));
      N(690, N("minecraft:petrified_oak_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "wood_old")));
      N(691, N("minecraft:cobblestone_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "cobblestone")));
      N(692, N("minecraft:brick_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "brick")));
      N(693, N("minecraft:stone_brick_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "stone_brick")));
      N(694, N("minecraft:nether_brick_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "nether_brick")));
      N(695, N("minecraft:quartz_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "quartz")));
      N(696, y("minecraft:smooth_stone"), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "stone")));
      N(697, y("minecraft:smooth_sandstone"), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "sandstone")));
      N(698, N("minecraft:petrified_oak_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "wood_old")));
      N(699, N("minecraft:cobblestone_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "cobblestone")));
      N(700, N("minecraft:brick_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "brick")));
      N(701, N("minecraft:stone_brick_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "stone_brick")));
      N(702, N("minecraft:nether_brick_slab", Mb), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "nether_brick")));
      N(703, y("minecraft:smooth_quartz"), N("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "quartz")));
      N(704, N("minecraft:stone_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "stone")));
      N(705, N("minecraft:sandstone_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "sandstone")));
      N(706, N("minecraft:petrified_oak_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "wood_old")));
      N(707, N("minecraft:cobblestone_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "cobblestone")));
      N(708, N("minecraft:brick_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "brick")));
      N(709, N("minecraft:stone_brick_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "stone_brick")));
      N(710, N("minecraft:nether_brick_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "nether_brick")));
      N(711, N("minecraft:quartz_slab", MT), N("minecraft:stone_slab", Map.of("half", "bottom", "variant", "quartz")));
      N(712, N("minecraft:stone_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "stone")));
      N(713, N("minecraft:sandstone_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "sandstone")));
      N(714, N("minecraft:petrified_oak_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "wood_old")));
      N(715, N("minecraft:cobblestone_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "cobblestone")));
      N(716, N("minecraft:brick_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "brick")));
      N(717, N("minecraft:stone_brick_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "stone_brick")));
      N(718, N("minecraft:nether_brick_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "nether_brick")));
      N(719, N("minecraft:quartz_slab", Mj), N("minecraft:stone_slab", Map.of("half", "top", "variant", "quartz")));
      N(720, y("minecraft:bricks"), y("minecraft:brick_block"));
      N(736, N("minecraft:tnt", Map.of("unstable", "false")), N("minecraft:tnt", Map.of("explode", "false")));
      N(737, N("minecraft:tnt", Map.of("unstable", "true")), N("minecraft:tnt", Map.of("explode", "true")));
      N(752, y("minecraft:bookshelf"), y("minecraft:bookshelf"));
   }

   private static void y() {
      N(0, y("minecraft:air"), y("minecraft:air"));
      N(16, y("minecraft:stone"), N("minecraft:stone", Map.of("variant", "stone")));
      N(17, y("minecraft:granite"), N("minecraft:stone", Map.of("variant", "granite")));
      N(18, y("minecraft:polished_granite"), N("minecraft:stone", Map.of("variant", "smooth_granite")));
      N(19, y("minecraft:diorite"), N("minecraft:stone", Map.of("variant", "diorite")));
      N(20, y("minecraft:polished_diorite"), N("minecraft:stone", Map.of("variant", "smooth_diorite")));
      N(21, y("minecraft:andesite"), N("minecraft:stone", Map.of("variant", "andesite")));
      N(22, y("minecraft:polished_andesite"), N("minecraft:stone", Map.of("variant", "smooth_andesite")));
      N(32, N("minecraft:grass_block", My), N("minecraft:grass", My), N("minecraft:grass", Map.of("snowy", "true")));
      N(
         48,
         y("minecraft:dirt"),
         N("minecraft:dirt", Map.of("snowy", "false", "variant", "dirt")),
         N("minecraft:dirt", Map.of("snowy", "true", "variant", "dirt"))
      );
      N(
         49,
         y("minecraft:coarse_dirt"),
         N("minecraft:dirt", Map.of("snowy", "false", "variant", "coarse_dirt")),
         N("minecraft:dirt", Map.of("snowy", "true", "variant", "coarse_dirt"))
      );
      N(
         50,
         N("minecraft:podzol", My),
         N("minecraft:dirt", Map.of("snowy", "false", "variant", "podzol")),
         N("minecraft:dirt", Map.of("snowy", "true", "variant", "podzol"))
      );
      N(64, y("minecraft:cobblestone"), y("minecraft:cobblestone"));
      N(80, y("minecraft:oak_planks"), N("minecraft:planks", Map.of("variant", "oak")));
      N(81, y("minecraft:spruce_planks"), N("minecraft:planks", Map.of("variant", "spruce")));
      N(82, y("minecraft:birch_planks"), N("minecraft:planks", Map.of("variant", "birch")));
      N(83, y("minecraft:jungle_planks"), N("minecraft:planks", Map.of("variant", "jungle")));
      N(84, y("minecraft:acacia_planks"), N("minecraft:planks", Map.of("variant", "acacia")));
      N(85, y("minecraft:dark_oak_planks"), N("minecraft:planks", Map.of("variant", "dark_oak")));
      N(96, N("minecraft:oak_sapling", ML), N("minecraft:sapling", Map.of("stage", "0", "type", "oak")));
      N(97, N("minecraft:spruce_sapling", ML), N("minecraft:sapling", Map.of("stage", "0", "type", "spruce")));
      N(98, N("minecraft:birch_sapling", ML), N("minecraft:sapling", Map.of("stage", "0", "type", "birch")));
      N(99, N("minecraft:jungle_sapling", ML), N("minecraft:sapling", Map.of("stage", "0", "type", "jungle")));
      N(100, N("minecraft:acacia_sapling", ML), N("minecraft:sapling", Map.of("stage", "0", "type", "acacia")));
      N(101, N("minecraft:dark_oak_sapling", ML), N("minecraft:sapling", Map.of("stage", "0", "type", "dark_oak")));
      N(104, N("minecraft:oak_sapling", Mu), N("minecraft:sapling", Map.of("stage", "1", "type", "oak")));
      N(105, N("minecraft:spruce_sapling", Mu), N("minecraft:sapling", Map.of("stage", "1", "type", "spruce")));
      N(106, N("minecraft:birch_sapling", Mu), N("minecraft:sapling", Map.of("stage", "1", "type", "birch")));
      N(107, N("minecraft:jungle_sapling", Mu), N("minecraft:sapling", Map.of("stage", "1", "type", "jungle")));
      N(108, N("minecraft:acacia_sapling", Mu), N("minecraft:sapling", Map.of("stage", "1", "type", "acacia")));
      N(109, N("minecraft:dark_oak_sapling", Mu), N("minecraft:sapling", Map.of("stage", "1", "type", "dark_oak")));
      N(112, y("minecraft:bedrock"), y("minecraft:bedrock"));
      N(128, N("minecraft:water", uo), N("minecraft:flowing_water", uo));
      N(129, N("minecraft:water", uq), N("minecraft:flowing_water", uq));
      N(130, N("minecraft:water", ua), N("minecraft:flowing_water", ua));
      N(131, N("minecraft:water", up), N("minecraft:flowing_water", up));
      N(132, N("minecraft:water", uF), N("minecraft:flowing_water", uF));
      N(133, N("minecraft:water", uA), N("minecraft:flowing_water", uA));
      N(134, N("minecraft:water", uf), N("minecraft:flowing_water", uf));
      N(135, N("minecraft:water", uC), N("minecraft:flowing_water", uC));
      N(136, N("minecraft:water", uS), N("minecraft:flowing_water", uS));
      N(137, N("minecraft:water", ux), N("minecraft:flowing_water", ux));
      N(138, N("minecraft:water", uK), N("minecraft:flowing_water", uK));
      N(139, N("minecraft:water", uV), N("minecraft:flowing_water", uV));
      N(140, N("minecraft:water", ue), N("minecraft:flowing_water", ue));
      N(141, N("minecraft:water", uH), N("minecraft:flowing_water", uH));
      N(142, N("minecraft:water", uc), N("minecraft:flowing_water", uc));
      N(143, N("minecraft:water", uX), N("minecraft:flowing_water", uX));
      N(144, N("minecraft:water", uo), N("minecraft:water", uo));
      N(145, N("minecraft:water", uq), N("minecraft:water", uq));
      N(146, N("minecraft:water", ua), N("minecraft:water", ua));
      N(147, N("minecraft:water", up), N("minecraft:water", up));
      N(148, N("minecraft:water", uF), N("minecraft:water", uF));
      N(149, N("minecraft:water", uA), N("minecraft:water", uA));
      N(150, N("minecraft:water", uf), N("minecraft:water", uf));
      N(151, N("minecraft:water", uC), N("minecraft:water", uC));
      N(152, N("minecraft:water", uS), N("minecraft:water", uS));
      N(153, N("minecraft:water", ux), N("minecraft:water", ux));
      N(154, N("minecraft:water", uK), N("minecraft:water", uK));
      N(155, N("minecraft:water", uV), N("minecraft:water", uV));
      N(156, N("minecraft:water", ue), N("minecraft:water", ue));
      N(157, N("minecraft:water", uH), N("minecraft:water", uH));
      N(158, N("minecraft:water", uc), N("minecraft:water", uc));
      N(159, N("minecraft:water", uX), N("minecraft:water", uX));
      N(160, N("minecraft:lava", uo), N("minecraft:flowing_lava", uo));
      N(161, N("minecraft:lava", uq), N("minecraft:flowing_lava", uq));
      N(162, N("minecraft:lava", ua), N("minecraft:flowing_lava", ua));
      N(163, N("minecraft:lava", up), N("minecraft:flowing_lava", up));
      N(164, N("minecraft:lava", uF), N("minecraft:flowing_lava", uF));
      N(165, N("minecraft:lava", uA), N("minecraft:flowing_lava", uA));
      N(166, N("minecraft:lava", uf), N("minecraft:flowing_lava", uf));
      N(167, N("minecraft:lava", uC), N("minecraft:flowing_lava", uC));
      N(168, N("minecraft:lava", uS), N("minecraft:flowing_lava", uS));
      N(169, N("minecraft:lava", ux), N("minecraft:flowing_lava", ux));
      N(170, N("minecraft:lava", uK), N("minecraft:flowing_lava", uK));
      N(171, N("minecraft:lava", uV), N("minecraft:flowing_lava", uV));
      N(172, N("minecraft:lava", ue), N("minecraft:flowing_lava", ue));
      N(173, N("minecraft:lava", uH), N("minecraft:flowing_lava", uH));
      N(174, N("minecraft:lava", uc), N("minecraft:flowing_lava", uc));
      N(175, N("minecraft:lava", uX), N("minecraft:flowing_lava", uX));
      N(176, N("minecraft:lava", uo), N("minecraft:lava", uo));
      N(177, N("minecraft:lava", uq), N("minecraft:lava", uq));
      N(178, N("minecraft:lava", ua), N("minecraft:lava", ua));
      N(179, N("minecraft:lava", up), N("minecraft:lava", up));
      N(180, N("minecraft:lava", uF), N("minecraft:lava", uF));
      N(181, N("minecraft:lava", uA), N("minecraft:lava", uA));
      N(182, N("minecraft:lava", uf), N("minecraft:lava", uf));
      N(183, N("minecraft:lava", uC), N("minecraft:lava", uC));
      N(184, N("minecraft:lava", uS), N("minecraft:lava", uS));
      N(185, N("minecraft:lava", ux), N("minecraft:lava", ux));
      N(186, N("minecraft:lava", uK), N("minecraft:lava", uK));
      N(187, N("minecraft:lava", uV), N("minecraft:lava", uV));
      N(188, N("minecraft:lava", ue), N("minecraft:lava", ue));
      N(189, N("minecraft:lava", uH), N("minecraft:lava", uH));
      N(190, N("minecraft:lava", uc), N("minecraft:lava", uc));
      N(191, N("minecraft:lava", uX), N("minecraft:lava", uX));
      N(192, y("minecraft:sand"), N("minecraft:sand", Map.of("variant", "sand")));
      N(193, y("minecraft:red_sand"), N("minecraft:sand", Map.of("variant", "red_sand")));
      N(208, y("minecraft:gravel"), y("minecraft:gravel"));
      N(224, y("minecraft:gold_ore"), y("minecraft:gold_ore"));
      N(240, y("minecraft:iron_ore"), y("minecraft:iron_ore"));
   }

   private static Dynamic<?> y(String var0) {
      return new Dynamic(JavaOps.INSTANCE, Map.of("Name", var0)).convert(class07713.N);
   }

   public static Dynamic<?> y(int var0) {
      Dynamic<?> dynamic = null;
      if (var0 >= 0 && var0 < y.length) {
         dynamic = y[var0];
      }

      return dynamic == null ? y[0] : dynamic;
   }

   private static void E() {
      N(2304, N("%%FILTER_ME%%", Map.of("facing", "down", "nodrop", "false")), N("minecraft:skull", Map.of("facing", "down", "nodrop", "false")));
      N(2305, N("%%FILTER_ME%%", Map.of("facing", "up", "nodrop", "false")), N("minecraft:skull", Map.of("facing", "up", "nodrop", "false")));
      N(2306, N("%%FILTER_ME%%", Map.of("facing", "north", "nodrop", "false")), N("minecraft:skull", Map.of("facing", "north", "nodrop", "false")));
      N(2307, N("%%FILTER_ME%%", Map.of("facing", "south", "nodrop", "false")), N("minecraft:skull", Map.of("facing", "south", "nodrop", "false")));
      N(2308, N("%%FILTER_ME%%", Map.of("facing", "west", "nodrop", "false")), N("minecraft:skull", Map.of("facing", "west", "nodrop", "false")));
      N(2309, N("%%FILTER_ME%%", Map.of("facing", "east", "nodrop", "false")), N("minecraft:skull", Map.of("facing", "east", "nodrop", "false")));
      N(2312, N("%%FILTER_ME%%", Map.of("facing", "down", "nodrop", "true")), N("minecraft:skull", Map.of("facing", "down", "nodrop", "true")));
      N(2313, N("%%FILTER_ME%%", Map.of("facing", "up", "nodrop", "true")), N("minecraft:skull", Map.of("facing", "up", "nodrop", "true")));
      N(2314, N("%%FILTER_ME%%", Map.of("facing", "north", "nodrop", "true")), N("minecraft:skull", Map.of("facing", "north", "nodrop", "true")));
      N(2315, N("%%FILTER_ME%%", Map.of("facing", "south", "nodrop", "true")), N("minecraft:skull", Map.of("facing", "south", "nodrop", "true")));
      N(2316, N("%%FILTER_ME%%", Map.of("facing", "west", "nodrop", "true")), N("minecraft:skull", Map.of("facing", "west", "nodrop", "true")));
      N(2317, N("%%FILTER_ME%%", Map.of("facing", "east", "nodrop", "true")), N("minecraft:skull", Map.of("facing", "east", "nodrop", "true")));
      N(2320, N("minecraft:anvil", yk), N("minecraft:anvil", Map.of("damage", "0", "facing", "south")));
      N(2321, N("minecraft:anvil", Li), N("minecraft:anvil", Map.of("damage", "0", "facing", "west")));
      N(2322, N("minecraft:anvil", yu), N("minecraft:anvil", Map.of("damage", "0", "facing", "north")));
      N(2323, N("minecraft:anvil", NJ), N("minecraft:anvil", Map.of("damage", "0", "facing", "east")));
      N(2324, N("minecraft:chipped_anvil", yk), N("minecraft:anvil", Map.of("damage", "1", "facing", "south")));
      N(2325, N("minecraft:chipped_anvil", Li), N("minecraft:anvil", Map.of("damage", "1", "facing", "west")));
      N(2326, N("minecraft:chipped_anvil", yu), N("minecraft:anvil", Map.of("damage", "1", "facing", "north")));
      N(2327, N("minecraft:chipped_anvil", NJ), N("minecraft:anvil", Map.of("damage", "1", "facing", "east")));
      N(2328, N("minecraft:damaged_anvil", yk), N("minecraft:anvil", Map.of("damage", "2", "facing", "south")));
      N(2329, N("minecraft:damaged_anvil", Li), N("minecraft:anvil", Map.of("damage", "2", "facing", "west")));
      N(2330, N("minecraft:damaged_anvil", yu), N("minecraft:anvil", Map.of("damage", "2", "facing", "north")));
      N(2331, N("minecraft:damaged_anvil", NJ), N("minecraft:anvil", Map.of("damage", "2", "facing", "east")));
      N(2338, N("minecraft:trapped_chest", Map.of("facing", "north", "type", "single")), N("minecraft:trapped_chest", yu));
      N(2339, N("minecraft:trapped_chest", Map.of("facing", "south", "type", "single")), N("minecraft:trapped_chest", yk));
      N(2340, N("minecraft:trapped_chest", Map.of("facing", "west", "type", "single")), N("minecraft:trapped_chest", Li));
      N(2341, N("minecraft:trapped_chest", Map.of("facing", "east", "type", "single")), N("minecraft:trapped_chest", NJ));
      N(2352, N("minecraft:light_weighted_pressure_plate", Rz), N("minecraft:light_weighted_pressure_plate", Rz));
      N(2353, N("minecraft:light_weighted_pressure_plate", RU), N("minecraft:light_weighted_pressure_plate", RU));
      N(2354, N("minecraft:light_weighted_pressure_plate", Rb), N("minecraft:light_weighted_pressure_plate", Rb));
      N(2355, N("minecraft:light_weighted_pressure_plate", Rj), N("minecraft:light_weighted_pressure_plate", Rj));
      N(2356, N("minecraft:light_weighted_pressure_plate", Rv), N("minecraft:light_weighted_pressure_plate", Rv));
      N(2357, N("minecraft:light_weighted_pressure_plate", Rn), N("minecraft:light_weighted_pressure_plate", Rn));
      N(2358, N("minecraft:light_weighted_pressure_plate", Rt), N("minecraft:light_weighted_pressure_plate", Rt));
      N(2359, N("minecraft:light_weighted_pressure_plate", RG), N("minecraft:light_weighted_pressure_plate", RG));
      N(2360, N("minecraft:light_weighted_pressure_plate", Rl), N("minecraft:light_weighted_pressure_plate", Rl));
      N(2361, N("minecraft:light_weighted_pressure_plate", Rd), N("minecraft:light_weighted_pressure_plate", Rd));
      N(2362, N("minecraft:light_weighted_pressure_plate", RE), N("minecraft:light_weighted_pressure_plate", RE));
      N(2363, N("minecraft:light_weighted_pressure_plate", RW), N("minecraft:light_weighted_pressure_plate", RW));
      N(2364, N("minecraft:light_weighted_pressure_plate", Rm), N("minecraft:light_weighted_pressure_plate", Rm));
      N(2365, N("minecraft:light_weighted_pressure_plate", RP), N("minecraft:light_weighted_pressure_plate", RP));
      N(2366, N("minecraft:light_weighted_pressure_plate", Rs), N("minecraft:light_weighted_pressure_plate", Rs));
      N(2367, N("minecraft:light_weighted_pressure_plate", RT), N("minecraft:light_weighted_pressure_plate", RT));
      N(2368, N("minecraft:heavy_weighted_pressure_plate", Rz), N("minecraft:heavy_weighted_pressure_plate", Rz));
      N(2369, N("minecraft:heavy_weighted_pressure_plate", RU), N("minecraft:heavy_weighted_pressure_plate", RU));
      N(2370, N("minecraft:heavy_weighted_pressure_plate", Rb), N("minecraft:heavy_weighted_pressure_plate", Rb));
      N(2371, N("minecraft:heavy_weighted_pressure_plate", Rj), N("minecraft:heavy_weighted_pressure_plate", Rj));
      N(2372, N("minecraft:heavy_weighted_pressure_plate", Rv), N("minecraft:heavy_weighted_pressure_plate", Rv));
      N(2373, N("minecraft:heavy_weighted_pressure_plate", Rn), N("minecraft:heavy_weighted_pressure_plate", Rn));
      N(2374, N("minecraft:heavy_weighted_pressure_plate", Rt), N("minecraft:heavy_weighted_pressure_plate", Rt));
      N(2375, N("minecraft:heavy_weighted_pressure_plate", RG), N("minecraft:heavy_weighted_pressure_plate", RG));
      N(2376, N("minecraft:heavy_weighted_pressure_plate", Rl), N("minecraft:heavy_weighted_pressure_plate", Rl));
      N(2377, N("minecraft:heavy_weighted_pressure_plate", Rd), N("minecraft:heavy_weighted_pressure_plate", Rd));
      N(2378, N("minecraft:heavy_weighted_pressure_plate", RE), N("minecraft:heavy_weighted_pressure_plate", RE));
      N(2379, N("minecraft:heavy_weighted_pressure_plate", RW), N("minecraft:heavy_weighted_pressure_plate", RW));
      N(2380, N("minecraft:heavy_weighted_pressure_plate", Rm), N("minecraft:heavy_weighted_pressure_plate", Rm));
      N(2381, N("minecraft:heavy_weighted_pressure_plate", RP), N("minecraft:heavy_weighted_pressure_plate", RP));
      N(2382, N("minecraft:heavy_weighted_pressure_plate", Rs), N("minecraft:heavy_weighted_pressure_plate", Rs));
      N(2383, N("minecraft:heavy_weighted_pressure_plate", RT), N("minecraft:heavy_weighted_pressure_plate", RT));
      N(2384, N("minecraft:comparator", ig), N("minecraft:unpowered_comparator", ig));
      N(2385, N("minecraft:comparator", iI), N("minecraft:unpowered_comparator", iI));
      N(2386, N("minecraft:comparator", iO), N("minecraft:unpowered_comparator", iO));
      N(2387, N("minecraft:comparator", iQ), N("minecraft:unpowered_comparator", iQ));
      N(2388, N("minecraft:comparator", iq), N("minecraft:unpowered_comparator", iq));
      N(2389, N("minecraft:comparator", iK), N("minecraft:unpowered_comparator", iK));
      N(2390, N("minecraft:comparator", io), N("minecraft:unpowered_comparator", io));
      N(2391, N("minecraft:comparator", iJ), N("minecraft:unpowered_comparator", iJ));
      N(2392, N("minecraft:comparator", Ru), N("minecraft:unpowered_comparator", Ru));
      N(2393, N("minecraft:comparator", Ri), N("minecraft:unpowered_comparator", Ri));
      N(2394, N("minecraft:comparator", RL), N("minecraft:unpowered_comparator", RL));
      N(2395, N("minecraft:comparator", Ry), N("minecraft:unpowered_comparator", Ry));
      N(2396, N("minecraft:comparator", RB), N("minecraft:unpowered_comparator", RB));
      N(2397, N("minecraft:comparator", RZ), N("minecraft:unpowered_comparator", RZ));
      N(2398, N("minecraft:comparator", RM), N("minecraft:unpowered_comparator", RM));
      N(2399, N("minecraft:comparator", RR), N("minecraft:unpowered_comparator", RR));
      N(2400, N("minecraft:comparator", ig), N("minecraft:powered_comparator", ig));
      N(2401, N("minecraft:comparator", iI), N("minecraft:powered_comparator", iI));
      N(2402, N("minecraft:comparator", iO), N("minecraft:powered_comparator", iO));
      N(2403, N("minecraft:comparator", iQ), N("minecraft:powered_comparator", iQ));
      N(2404, N("minecraft:comparator", iq), N("minecraft:powered_comparator", iq));
      N(2405, N("minecraft:comparator", iK), N("minecraft:powered_comparator", iK));
      N(2406, N("minecraft:comparator", io), N("minecraft:powered_comparator", io));
      N(2407, N("minecraft:comparator", iJ), N("minecraft:powered_comparator", iJ));
      N(2408, N("minecraft:comparator", Ru), N("minecraft:powered_comparator", Ru));
      N(2409, N("minecraft:comparator", Ri), N("minecraft:powered_comparator", Ri));
      N(2410, N("minecraft:comparator", RL), N("minecraft:powered_comparator", RL));
      N(2411, N("minecraft:comparator", Ry), N("minecraft:powered_comparator", Ry));
      N(2412, N("minecraft:comparator", RB), N("minecraft:powered_comparator", RB));
      N(2413, N("minecraft:comparator", RZ), N("minecraft:powered_comparator", RZ));
      N(2414, N("minecraft:comparator", RM), N("minecraft:powered_comparator", RM));
      N(2415, N("minecraft:comparator", RR), N("minecraft:powered_comparator", RR));
      N(2416, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "0")), N("minecraft:daylight_detector", Rz));
      N(2417, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "1")), N("minecraft:daylight_detector", RU));
      N(2418, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "2")), N("minecraft:daylight_detector", Rb));
      N(2419, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "3")), N("minecraft:daylight_detector", Rj));
      N(2420, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "4")), N("minecraft:daylight_detector", Rv));
      N(2421, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "5")), N("minecraft:daylight_detector", Rn));
      N(2422, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "6")), N("minecraft:daylight_detector", Rt));
      N(2423, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "7")), N("minecraft:daylight_detector", RG));
      N(2424, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "8")), N("minecraft:daylight_detector", Rl));
      N(2425, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "9")), N("minecraft:daylight_detector", Rd));
      N(2426, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "10")), N("minecraft:daylight_detector", RE));
      N(2427, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "11")), N("minecraft:daylight_detector", RW));
      N(2428, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "12")), N("minecraft:daylight_detector", Rm));
      N(2429, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "13")), N("minecraft:daylight_detector", RP));
      N(2430, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "14")), N("minecraft:daylight_detector", Rs));
      N(2431, N("minecraft:daylight_detector", Map.of("inverted", "false", "power", "15")), N("minecraft:daylight_detector", RT));
      N(2432, y("minecraft:redstone_block"), y("minecraft:redstone_block"));
      N(2448, y("minecraft:nether_quartz_ore"), y("minecraft:quartz_ore"));
      N(2464, N("minecraft:hopper", Map.of("enabled", "true", "facing", "down")), N("minecraft:hopper", Map.of("enabled", "true", "facing", "down")));
      N(2466, N("minecraft:hopper", Map.of("enabled", "true", "facing", "north")), N("minecraft:hopper", Map.of("enabled", "true", "facing", "north")));
      N(2467, N("minecraft:hopper", Map.of("enabled", "true", "facing", "south")), N("minecraft:hopper", Map.of("enabled", "true", "facing", "south")));
      N(2468, N("minecraft:hopper", Map.of("enabled", "true", "facing", "west")), N("minecraft:hopper", Map.of("enabled", "true", "facing", "west")));
      N(2469, N("minecraft:hopper", Map.of("enabled", "true", "facing", "east")), N("minecraft:hopper", Map.of("enabled", "true", "facing", "east")));
      N(2472, N("minecraft:hopper", Map.of("enabled", "false", "facing", "down")), N("minecraft:hopper", Map.of("enabled", "false", "facing", "down")));
      N(2474, N("minecraft:hopper", Map.of("enabled", "false", "facing", "north")), N("minecraft:hopper", Map.of("enabled", "false", "facing", "north")));
      N(2475, N("minecraft:hopper", Map.of("enabled", "false", "facing", "south")), N("minecraft:hopper", Map.of("enabled", "false", "facing", "south")));
      N(2476, N("minecraft:hopper", Map.of("enabled", "false", "facing", "west")), N("minecraft:hopper", Map.of("enabled", "false", "facing", "west")));
      N(2477, N("minecraft:hopper", Map.of("enabled", "false", "facing", "east")), N("minecraft:hopper", Map.of("enabled", "false", "facing", "east")));
      N(2480, y("minecraft:quartz_block"), N("minecraft:quartz_block", Map.of("variant", "default")));
      N(2481, y("minecraft:chiseled_quartz_block"), N("minecraft:quartz_block", Map.of("variant", "chiseled")));
      N(2482, N("minecraft:quartz_pillar", V), N("minecraft:quartz_block", Map.of("variant", "lines_y")));
      N(2483, N("minecraft:quartz_pillar", K), N("minecraft:quartz_block", Map.of("variant", "lines_x")));
      N(2484, N("minecraft:quartz_pillar", e), N("minecraft:quartz_block", Map.of("variant", "lines_z")));
      N(
         2496,
         N("minecraft:quartz_stairs", Lr),
         N("minecraft:quartz_stairs", LK),
         N("minecraft:quartz_stairs", Lc),
         N("minecraft:quartz_stairs", LF),
         N("minecraft:quartz_stairs", LS),
         N("minecraft:quartz_stairs", Lr)
      );
      N(
         2497,
         N("minecraft:quartz_stairs", uL),
         N("minecraft:quartz_stairs", LH),
         N("minecraft:quartz_stairs", Lp),
         N("minecraft:quartz_stairs", LC),
         N("minecraft:quartz_stairs", Lh),
         N("minecraft:quartz_stairs", uL)
      );
      N(
         2498,
         N("minecraft:quartz_stairs", uy),
         N("minecraft:quartz_stairs", Le),
         N("minecraft:quartz_stairs", La),
         N("minecraft:quartz_stairs", Lf),
         N("minecraft:quartz_stairs", LD),
         N("minecraft:quartz_stairs", uy)
      );
      N(
         2499,
         N("minecraft:quartz_stairs", uN),
         N("minecraft:quartz_stairs", LV),
         N("minecraft:quartz_stairs", LX),
         N("minecraft:quartz_stairs", LA),
         N("minecraft:quartz_stairs", Lx),
         N("minecraft:quartz_stairs", uN)
      );
      N(
         2500,
         N("minecraft:quartz_stairs", uQ),
         N("minecraft:quartz_stairs", uW),
         N("minecraft:quartz_stairs", uT),
         N("minecraft:quartz_stairs", un),
         N("minecraft:quartz_stairs", ud),
         N("minecraft:quartz_stairs", uQ)
      );
      N(
         2501,
         N("minecraft:quartz_stairs", uI),
         N("minecraft:quartz_stairs", us),
         N("minecraft:quartz_stairs", uv),
         N("minecraft:quartz_stairs", ul),
         N("minecraft:quartz_stairs", uY),
         N("minecraft:quartz_stairs", uI)
      );
      N(
         2502,
         N("minecraft:quartz_stairs", ug),
         N("minecraft:quartz_stairs", uP),
         N("minecraft:quartz_stairs", uj),
         N("minecraft:quartz_stairs", uG),
         N("minecraft:quartz_stairs", uk),
         N("minecraft:quartz_stairs", ug)
      );
      N(
         2503,
         N("minecraft:quartz_stairs", uO),
         N("minecraft:quartz_stairs", um),
         N("minecraft:quartz_stairs", ub),
         N("minecraft:quartz_stairs", ut),
         N("minecraft:quartz_stairs", uw),
         N("minecraft:quartz_stairs", uO)
      );
      N(2512, N("minecraft:activator_rail", Rr), N("minecraft:activator_rail", Rr));
      N(2513, N("minecraft:activator_rail", RD), N("minecraft:activator_rail", RD));
      N(2514, N("minecraft:activator_rail", Ra), N("minecraft:activator_rail", Ra));
      N(2515, N("minecraft:activator_rail", RS), N("minecraft:activator_rail", RS));
      N(2516, N("minecraft:activator_rail", RF), N("minecraft:activator_rail", RF));
      N(2517, N("minecraft:activator_rail", Rf), N("minecraft:activator_rail", Rf));
      N(2520, N("minecraft:activator_rail", MN), N("minecraft:activator_rail", MN));
      N(2521, N("minecraft:activator_rail", Rh), N("minecraft:activator_rail", Rh));
      N(2522, N("minecraft:activator_rail", Rp), N("minecraft:activator_rail", Rp));
      N(2523, N("minecraft:activator_rail", Rx), N("minecraft:activator_rail", Rx));
      N(2524, N("minecraft:activator_rail", RA), N("minecraft:activator_rail", RA));
      N(2525, N("minecraft:activator_rail", RC), N("minecraft:activator_rail", RC));
      N(2528, N("minecraft:dropper", Mi), N("minecraft:dropper", Mi));
      N(2529, N("minecraft:dropper", MZ), N("minecraft:dropper", MZ));
      N(2530, N("minecraft:dropper", MM), N("minecraft:dropper", MM));
      N(2531, N("minecraft:dropper", MB), N("minecraft:dropper", MB));
      N(2532, N("minecraft:dropper", Mz), N("minecraft:dropper", Mz));
      N(2533, N("minecraft:dropper", MR), N("minecraft:dropper", MR));
      N(2536, N("minecraft:dropper", MU), N("minecraft:dropper", MU));
      N(2537, N("minecraft:dropper", MP), N("minecraft:dropper", MP));
      N(2538, N("minecraft:dropper", MW), N("minecraft:dropper", MW));
      N(2539, N("minecraft:dropper", Mm), N("minecraft:dropper", Mm));
      N(2540, N("minecraft:dropper", Ms), N("minecraft:dropper", Ms));
      N(2541, N("minecraft:dropper", ME), N("minecraft:dropper", ME));
      N(2544, y("minecraft:white_terracotta"), N("minecraft:stained_hardened_clay", Ni));
      N(2545, y("minecraft:orange_terracotta"), N("minecraft:stained_hardened_clay", r));
      N(2546, y("minecraft:magenta_terracotta"), N("minecraft:stained_hardened_clay", h));
      N(2547, y("minecraft:light_blue_terracotta"), N("minecraft:stained_hardened_clay", x));
      N(2548, y("minecraft:yellow_terracotta"), N("minecraft:stained_hardened_clay", NR));
      N(2549, y("minecraft:lime_terracotta"), N("minecraft:stained_hardened_clay", D));
      N(2550, y("minecraft:pink_terracotta"), N("minecraft:stained_hardened_clay", NN));
      N(2551, y("minecraft:gray_terracotta"), N("minecraft:stained_hardened_clay", C));
      N(2552, y("minecraft:light_gray_terracotta"), N("minecraft:stained_hardened_clay", Nu));
      N(2553, y("minecraft:cyan_terracotta"), N("minecraft:stained_hardened_clay", f));
      N(2554, y("minecraft:purple_terracotta"), N("minecraft:stained_hardened_clay", Ny));
      N(2555, y("minecraft:blue_terracotta"), N("minecraft:stained_hardened_clay", F));
      N(2556, y("minecraft:brown_terracotta"), N("minecraft:stained_hardened_clay", A));
      N(2557, y("minecraft:green_terracotta"), N("minecraft:stained_hardened_clay", S));
      N(2558, y("minecraft:red_terracotta"), N("minecraft:stained_hardened_clay", NL));
      N(2559, y("minecraft:black_terracotta"), N("minecraft:stained_hardened_clay", p));
   }

   public static String N(int var0) {
      if (var0 >= 0 && var0 < y.length) {
         Dynamic<?> dynamic = y[var0];
         return dynamic == null ? "minecraft:air" : dynamic.get("Name").asString("");
      } else {
         return "minecraft:air";
      }
   }

   public static Dynamic<?> N(Dynamic<?> var0) {
      int ixx = u.getInt(var0);
      if (ixx >= 0 && ixx < y.length) {
         Dynamic<?> dynamic = y[ixx];
         return dynamic == null ? var0 : dynamic;
      } else {
         return var0;
      }
   }

   public static String N(String var0) {
      int ixx = i.getInt(var0);
      if (ixx >= 0 && ixx < y.length) {
         Dynamic<?> dynamic = y[ixx];
         return dynamic == null ? var0 : dynamic.get("Name").asString("");
      } else {
         return var0;
      }
   }

   private static Dynamic<?> N(String var0, Map<String, String> var1) {
      return new Dynamic(JavaOps.INSTANCE, Map.of("Name", var0, "Properties", var1)).convert(class07713.N);
   }

   private static void N(int var0, Dynamic<?> var1, Dynamic<?>... var2) {
      y[var0] = var1;
      int ixx = var0 >> 4;
      if (L[ixx] == null) {
         L[ixx] = var1;
      }

      for (Dynamic dynamic : var2) {
         String sx = dynamic.get("Name").asString("");
         i.putIfAbsent(sx, var0);
         u.put(dynamic, var0);
      }
   }

   private static void N() {
      for (int ixx = 0; ixx < y.length; ixx++) {
         if (y[ixx] == null) {
            y[ixx] = L[ixx >> 4];
         }
      }
   }

   private static void W() {
      N(
         2560,
         N("minecraft:white_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2561,
         N("minecraft:orange_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2562,
         N("minecraft:magenta_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2563,
         N("minecraft:light_blue_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2564,
         N("minecraft:yellow_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2565,
         N("minecraft:lime_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2566,
         N("minecraft:pink_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2567,
         N("minecraft:gray_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2568,
         N("minecraft:light_gray_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2569,
         N("minecraft:cyan_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2570,
         N("minecraft:purple_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2571,
         N("minecraft:blue_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2572,
         N("minecraft:brown_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2573,
         N("minecraft:green_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2574,
         N("minecraft:red_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(
         2575,
         N("minecraft:black_stained_glass_pane", Mn),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "true", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "false", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "false", "west", "true")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "true", "west", "false")),
         N("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      N(2576, N("minecraft:acacia_leaves", c), N("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "true", "variant", "acacia")));
      N(2577, N("minecraft:dark_oak_leaves", c), N("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "true", "variant", "dark_oak")));
      N(2580, N("minecraft:acacia_leaves", H), N("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "false", "variant", "acacia")));
      N(2581, N("minecraft:dark_oak_leaves", H), N("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "false", "variant", "dark_oak")));
      N(2584, N("minecraft:acacia_leaves", a), N("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "true", "variant", "acacia")));
      N(2585, N("minecraft:dark_oak_leaves", a), N("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "true", "variant", "dark_oak")));
      N(2588, N("minecraft:acacia_leaves", X), N("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "false", "variant", "acacia")));
      N(2589, N("minecraft:dark_oak_leaves", X), N("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "false", "variant", "dark_oak")));
      N(2592, N("minecraft:acacia_log", V), N("minecraft:log2", Map.of("axis", "y", "variant", "acacia")));
      N(2593, N("minecraft:dark_oak_log", V), N("minecraft:log2", Map.of("axis", "y", "variant", "dark_oak")));
      N(2596, N("minecraft:acacia_log", K), N("minecraft:log2", Map.of("axis", "x", "variant", "acacia")));
      N(2597, N("minecraft:dark_oak_log", K), N("minecraft:log2", Map.of("axis", "x", "variant", "dark_oak")));
      N(2600, N("minecraft:acacia_log", e), N("minecraft:log2", Map.of("axis", "z", "variant", "acacia")));
      N(2601, N("minecraft:dark_oak_log", e), N("minecraft:log2", Map.of("axis", "z", "variant", "dark_oak")));
      N(2604, y("minecraft:acacia_bark"), N("minecraft:log2", Map.of("axis", "none", "variant", "acacia")));
      N(2605, y("minecraft:dark_oak_bark"), N("minecraft:log2", Map.of("axis", "none", "variant", "dark_oak")));
      N(
         2608,
         N("minecraft:acacia_stairs", Lr),
         N("minecraft:acacia_stairs", LK),
         N("minecraft:acacia_stairs", Lc),
         N("minecraft:acacia_stairs", LF),
         N("minecraft:acacia_stairs", LS),
         N("minecraft:acacia_stairs", Lr)
      );
      N(
         2609,
         N("minecraft:acacia_stairs", uL),
         N("minecraft:acacia_stairs", LH),
         N("minecraft:acacia_stairs", Lp),
         N("minecraft:acacia_stairs", LC),
         N("minecraft:acacia_stairs", Lh),
         N("minecraft:acacia_stairs", uL)
      );
      N(
         2610,
         N("minecraft:acacia_stairs", uy),
         N("minecraft:acacia_stairs", Le),
         N("minecraft:acacia_stairs", La),
         N("minecraft:acacia_stairs", Lf),
         N("minecraft:acacia_stairs", LD),
         N("minecraft:acacia_stairs", uy)
      );
      N(
         2611,
         N("minecraft:acacia_stairs", uN),
         N("minecraft:acacia_stairs", LV),
         N("minecraft:acacia_stairs", LX),
         N("minecraft:acacia_stairs", LA),
         N("minecraft:acacia_stairs", Lx),
         N("minecraft:acacia_stairs", uN)
      );
      N(
         2612,
         N("minecraft:acacia_stairs", uQ),
         N("minecraft:acacia_stairs", uW),
         N("minecraft:acacia_stairs", uT),
         N("minecraft:acacia_stairs", un),
         N("minecraft:acacia_stairs", ud),
         N("minecraft:acacia_stairs", uQ)
      );
      N(
         2613,
         N("minecraft:acacia_stairs", uI),
         N("minecraft:acacia_stairs", us),
         N("minecraft:acacia_stairs", uv),
         N("minecraft:acacia_stairs", ul),
         N("minecraft:acacia_stairs", uY),
         N("minecraft:acacia_stairs", uI)
      );
      N(
         2614,
         N("minecraft:acacia_stairs", ug),
         N("minecraft:acacia_stairs", uP),
         N("minecraft:acacia_stairs", uj),
         N("minecraft:acacia_stairs", uG),
         N("minecraft:acacia_stairs", uk),
         N("minecraft:acacia_stairs", ug)
      );
      N(
         2615,
         N("minecraft:acacia_stairs", uO),
         N("minecraft:acacia_stairs", um),
         N("minecraft:acacia_stairs", ub),
         N("minecraft:acacia_stairs", ut),
         N("minecraft:acacia_stairs", uw),
         N("minecraft:acacia_stairs", uO)
      );
      N(
         2624,
         N("minecraft:dark_oak_stairs", Lr),
         N("minecraft:dark_oak_stairs", LK),
         N("minecraft:dark_oak_stairs", Lc),
         N("minecraft:dark_oak_stairs", LF),
         N("minecraft:dark_oak_stairs", LS),
         N("minecraft:dark_oak_stairs", Lr)
      );
      N(
         2625,
         N("minecraft:dark_oak_stairs", uL),
         N("minecraft:dark_oak_stairs", LH),
         N("minecraft:dark_oak_stairs", Lp),
         N("minecraft:dark_oak_stairs", LC),
         N("minecraft:dark_oak_stairs", Lh),
         N("minecraft:dark_oak_stairs", uL)
      );
      N(
         2626,
         N("minecraft:dark_oak_stairs", uy),
         N("minecraft:dark_oak_stairs", Le),
         N("minecraft:dark_oak_stairs", La),
         N("minecraft:dark_oak_stairs", Lf),
         N("minecraft:dark_oak_stairs", LD),
         N("minecraft:dark_oak_stairs", uy)
      );
      N(
         2627,
         N("minecraft:dark_oak_stairs", uN),
         N("minecraft:dark_oak_stairs", LV),
         N("minecraft:dark_oak_stairs", LX),
         N("minecraft:dark_oak_stairs", LA),
         N("minecraft:dark_oak_stairs", Lx),
         N("minecraft:dark_oak_stairs", uN)
      );
      N(
         2628,
         N("minecraft:dark_oak_stairs", uQ),
         N("minecraft:dark_oak_stairs", uW),
         N("minecraft:dark_oak_stairs", uT),
         N("minecraft:dark_oak_stairs", un),
         N("minecraft:dark_oak_stairs", ud),
         N("minecraft:dark_oak_stairs", uQ)
      );
      N(
         2629,
         N("minecraft:dark_oak_stairs", uI),
         N("minecraft:dark_oak_stairs", us),
         N("minecraft:dark_oak_stairs", uv),
         N("minecraft:dark_oak_stairs", ul),
         N("minecraft:dark_oak_stairs", uY),
         N("minecraft:dark_oak_stairs", uI)
      );
      N(
         2630,
         N("minecraft:dark_oak_stairs", ug),
         N("minecraft:dark_oak_stairs", uP),
         N("minecraft:dark_oak_stairs", uj),
         N("minecraft:dark_oak_stairs", uG),
         N("minecraft:dark_oak_stairs", uk),
         N("minecraft:dark_oak_stairs", ug)
      );
      N(
         2631,
         N("minecraft:dark_oak_stairs", uO),
         N("minecraft:dark_oak_stairs", um),
         N("minecraft:dark_oak_stairs", ub),
         N("minecraft:dark_oak_stairs", ut),
         N("minecraft:dark_oak_stairs", uw),
         N("minecraft:dark_oak_stairs", uO)
      );
      N(2640, y("minecraft:slime_block"), y("minecraft:slime"));
      N(2656, y("minecraft:barrier"), y("minecraft:barrier"));
      N(2672, N("minecraft:iron_trapdoor", LQ), N("minecraft:iron_trapdoor", LQ));
      N(2673, N("minecraft:iron_trapdoor", LO), N("minecraft:iron_trapdoor", LO));
      N(2674, N("minecraft:iron_trapdoor", Lg), N("minecraft:iron_trapdoor", Lg));
      N(2675, N("minecraft:iron_trapdoor", LY), N("minecraft:iron_trapdoor", LY));
      N(2676, N("minecraft:iron_trapdoor", LJ), N("minecraft:iron_trapdoor", LJ));
      N(2677, N("minecraft:iron_trapdoor", Lo), N("minecraft:iron_trapdoor", Lo));
      N(2678, N("minecraft:iron_trapdoor", Lq), N("minecraft:iron_trapdoor", Lq));
      N(2679, N("minecraft:iron_trapdoor", LI), N("minecraft:iron_trapdoor", LI));
      N(2680, N("minecraft:iron_trapdoor", uR), N("minecraft:iron_trapdoor", uR));
      N(2681, N("minecraft:iron_trapdoor", uM), N("minecraft:iron_trapdoor", uM));
      N(2682, N("minecraft:iron_trapdoor", uB), N("minecraft:iron_trapdoor", uB));
      N(2683, N("minecraft:iron_trapdoor", ui), N("minecraft:iron_trapdoor", ui));
      N(2684, N("minecraft:iron_trapdoor", uz), N("minecraft:iron_trapdoor", uz));
      N(2685, N("minecraft:iron_trapdoor", uU), N("minecraft:iron_trapdoor", uU));
      N(2686, N("minecraft:iron_trapdoor", uE), N("minecraft:iron_trapdoor", uE));
      N(2687, N("minecraft:iron_trapdoor", uZ), N("minecraft:iron_trapdoor", uZ));
      N(2688, y("minecraft:prismarine"), N("minecraft:prismarine", Map.of("variant", "prismarine")));
      N(2689, y("minecraft:prismarine_bricks"), N("minecraft:prismarine", Map.of("variant", "prismarine_bricks")));
      N(2690, y("minecraft:dark_prismarine"), N("minecraft:prismarine", Map.of("variant", "dark_prismarine")));
      N(2704, y("minecraft:sea_lantern"), y("minecraft:sea_lantern"));
      N(2720, N("minecraft:hay_block", V), N("minecraft:hay_block", V));
      N(2724, N("minecraft:hay_block", K), N("minecraft:hay_block", K));
      N(2728, N("minecraft:hay_block", e), N("minecraft:hay_block", e));
      N(2736, y("minecraft:white_carpet"), N("minecraft:carpet", Ni));
      N(2737, y("minecraft:orange_carpet"), N("minecraft:carpet", r));
      N(2738, y("minecraft:magenta_carpet"), N("minecraft:carpet", h));
      N(2739, y("minecraft:light_blue_carpet"), N("minecraft:carpet", x));
      N(2740, y("minecraft:yellow_carpet"), N("minecraft:carpet", NR));
      N(2741, y("minecraft:lime_carpet"), N("minecraft:carpet", D));
      N(2742, y("minecraft:pink_carpet"), N("minecraft:carpet", NN));
      N(2743, y("minecraft:gray_carpet"), N("minecraft:carpet", C));
      N(2744, y("minecraft:light_gray_carpet"), N("minecraft:carpet", Nu));
      N(2745, y("minecraft:cyan_carpet"), N("minecraft:carpet", f));
      N(2746, y("minecraft:purple_carpet"), N("minecraft:carpet", Ny));
      N(2747, y("minecraft:blue_carpet"), N("minecraft:carpet", F));
      N(2748, y("minecraft:brown_carpet"), N("minecraft:carpet", A));
      N(2749, y("minecraft:green_carpet"), N("minecraft:carpet", S));
      N(2750, y("minecraft:red_carpet"), N("minecraft:carpet", NL));
      N(2751, y("minecraft:black_carpet"), N("minecraft:carpet", p));
      N(2752, y("minecraft:terracotta"), y("minecraft:hardened_clay"));
      N(2768, y("minecraft:coal_block"), y("minecraft:coal_block"));
      N(2784, y("minecraft:packed_ice"), y("minecraft:packed_ice"));
      N(
         2800,
         N("minecraft:sunflower", uu),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "sunflower"))
      );
      N(
         2801,
         N("minecraft:lilac", uu),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "syringa")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "syringa")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "syringa")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "syringa"))
      );
      N(
         2802,
         N("minecraft:tall_grass", uu),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "double_grass"))
      );
      N(
         2803,
         N("minecraft:large_fern", uu),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "double_fern"))
      );
      N(
         2804,
         N("minecraft:rose_bush", uu),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "double_rose"))
      );
      N(
         2805,
         N("minecraft:peony", uu),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "paeonia"))
      );
      N(
         2808,
         N("minecraft:peony", uJ),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "syringa"))
      );
      N(
         2809,
         N("minecraft:peony", uJ),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "syringa"))
      );
      N(
         2810,
         N("minecraft:peony", uJ),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "syringa"))
      );
      N(
         2811,
         N("minecraft:peony", uJ),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "double_fern")),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "double_grass")),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "double_rose")),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "paeonia")),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "sunflower")),
         N("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "syringa"))
      );
   }

   private static void R() {
      N(832, y("minecraft:mob_spawner"), y("minecraft:mob_spawner"));
      N(
         848,
         N("minecraft:oak_stairs", Lr),
         N("minecraft:oak_stairs", LK),
         N("minecraft:oak_stairs", Lc),
         N("minecraft:oak_stairs", LF),
         N("minecraft:oak_stairs", LS),
         N("minecraft:oak_stairs", Lr)
      );
      N(
         849,
         N("minecraft:oak_stairs", uL),
         N("minecraft:oak_stairs", LH),
         N("minecraft:oak_stairs", Lp),
         N("minecraft:oak_stairs", LC),
         N("minecraft:oak_stairs", Lh),
         N("minecraft:oak_stairs", uL)
      );
      N(
         850,
         N("minecraft:oak_stairs", uy),
         N("minecraft:oak_stairs", Le),
         N("minecraft:oak_stairs", La),
         N("minecraft:oak_stairs", Lf),
         N("minecraft:oak_stairs", LD),
         N("minecraft:oak_stairs", uy)
      );
      N(
         851,
         N("minecraft:oak_stairs", uN),
         N("minecraft:oak_stairs", LV),
         N("minecraft:oak_stairs", LX),
         N("minecraft:oak_stairs", LA),
         N("minecraft:oak_stairs", Lx),
         N("minecraft:oak_stairs", uN)
      );
      N(
         852,
         N("minecraft:oak_stairs", uQ),
         N("minecraft:oak_stairs", uW),
         N("minecraft:oak_stairs", uT),
         N("minecraft:oak_stairs", un),
         N("minecraft:oak_stairs", ud),
         N("minecraft:oak_stairs", uQ)
      );
      N(
         853,
         N("minecraft:oak_stairs", uI),
         N("minecraft:oak_stairs", us),
         N("minecraft:oak_stairs", uv),
         N("minecraft:oak_stairs", ul),
         N("minecraft:oak_stairs", uY),
         N("minecraft:oak_stairs", uI)
      );
      N(
         854,
         N("minecraft:oak_stairs", ug),
         N("minecraft:oak_stairs", uP),
         N("minecraft:oak_stairs", uj),
         N("minecraft:oak_stairs", uG),
         N("minecraft:oak_stairs", uk),
         N("minecraft:oak_stairs", ug)
      );
      N(
         855,
         N("minecraft:oak_stairs", uO),
         N("minecraft:oak_stairs", um),
         N("minecraft:oak_stairs", ub),
         N("minecraft:oak_stairs", ut),
         N("minecraft:oak_stairs", uw),
         N("minecraft:oak_stairs", uO)
      );
      N(866, N("minecraft:chest", Map.of("facing", "north", "type", "single")), N("minecraft:chest", yu));
      N(867, N("minecraft:chest", Map.of("facing", "south", "type", "single")), N("minecraft:chest", yk));
      N(868, N("minecraft:chest", Map.of("facing", "west", "type", "single")), N("minecraft:chest", Li));
      N(869, N("minecraft:chest", Map.of("facing", "east", "type", "single")), N("minecraft:chest", NJ));
      N(
         880,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "up", "west", "up"))
      );
      N(
         881,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "up", "west", "up"))
      );
      N(
         882,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "up", "west", "up"))
      );
      N(
         883,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "up", "west", "up"))
      );
      N(
         884,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "up", "west", "up"))
      );
      N(
         885,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "up", "west", "up"))
      );
      N(
         886,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "up", "west", "up"))
      );
      N(
         887,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "up", "west", "up"))
      );
      N(
         888,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "up", "west", "up"))
      );
      N(
         889,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "up", "west", "up"))
      );
      N(
         890,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "up", "west", "up"))
      );
      N(
         891,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "up", "west", "up"))
      );
      N(
         892,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "up", "west", "up"))
      );
      N(
         893,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "up", "west", "up"))
      );
      N(
         894,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "up", "west", "up"))
      );
      N(
         895,
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "up", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "none", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "none", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "none", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "side", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "side", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "side", "west", "up")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "up", "west", "none")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "up", "west", "side")),
         N("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "up", "west", "up"))
      );
      N(896, y("minecraft:diamond_ore"), y("minecraft:diamond_ore"));
      N(912, y("minecraft:diamond_block"), y("minecraft:diamond_block"));
      N(928, y("minecraft:crafting_table"), y("minecraft:crafting_table"));
      N(944, N("minecraft:wheat", B), N("minecraft:wheat", B));
      N(945, N("minecraft:wheat", W), N("minecraft:wheat", W));
      N(946, N("minecraft:wheat", l), N("minecraft:wheat", l));
      N(947, N("minecraft:wheat", Q), N("minecraft:wheat", Q));
      N(948, N("minecraft:wheat", O), N("minecraft:wheat", O));
      N(949, N("minecraft:wheat", g), N("minecraft:wheat", g));
      N(950, N("minecraft:wheat", I), N("minecraft:wheat", I));
      N(951, N("minecraft:wheat", J), N("minecraft:wheat", J));
      N(960, N("minecraft:farmland", Map.of("moisture", "0")), N("minecraft:farmland", Map.of("moisture", "0")));
      N(961, N("minecraft:farmland", Map.of("moisture", "1")), N("minecraft:farmland", Map.of("moisture", "1")));
      N(962, N("minecraft:farmland", Map.of("moisture", "2")), N("minecraft:farmland", Map.of("moisture", "2")));
      N(963, N("minecraft:farmland", Map.of("moisture", "3")), N("minecraft:farmland", Map.of("moisture", "3")));
      N(964, N("minecraft:farmland", Map.of("moisture", "4")), N("minecraft:farmland", Map.of("moisture", "4")));
      N(965, N("minecraft:farmland", Map.of("moisture", "5")), N("minecraft:farmland", Map.of("moisture", "5")));
      N(966, N("minecraft:farmland", Map.of("moisture", "6")), N("minecraft:farmland", Map.of("moisture", "6")));
      N(967, N("minecraft:farmland", Map.of("moisture", "7")), N("minecraft:farmland", Map.of("moisture", "7")));
      N(978, N("minecraft:furnace", Map.of("facing", "north", "lit", "false")), N("minecraft:furnace", yu));
      N(979, N("minecraft:furnace", Map.of("facing", "south", "lit", "false")), N("minecraft:furnace", yk));
      N(980, N("minecraft:furnace", Map.of("facing", "west", "lit", "false")), N("minecraft:furnace", Li));
      N(981, N("minecraft:furnace", Map.of("facing", "east", "lit", "false")), N("minecraft:furnace", NJ));
      N(994, N("minecraft:furnace", Map.of("facing", "north", "lit", "true")), N("minecraft:lit_furnace", yu));
      N(995, N("minecraft:furnace", Map.of("facing", "south", "lit", "true")), N("minecraft:lit_furnace", yk));
      N(996, N("minecraft:furnace", Map.of("facing", "west", "lit", "true")), N("minecraft:lit_furnace", Li));
      N(997, N("minecraft:furnace", Map.of("facing", "east", "lit", "true")), N("minecraft:lit_furnace", NJ));
      N(1008, N("minecraft:sign", Rw), N("minecraft:standing_sign", Rw));
      N(1009, N("minecraft:sign", Rk), N("minecraft:standing_sign", Rk));
      N(1010, N("minecraft:sign", Ro), N("minecraft:standing_sign", Ro));
      N(1011, N("minecraft:sign", Rq), N("minecraft:standing_sign", Rq));
      N(1012, N("minecraft:sign", RK), N("minecraft:standing_sign", RK));
      N(1013, N("minecraft:sign", RV), N("minecraft:standing_sign", RV));
      N(1014, N("minecraft:sign", Re), N("minecraft:standing_sign", Re));
      N(1015, N("minecraft:sign", RH), N("minecraft:standing_sign", RH));
      N(1016, N("minecraft:sign", Rc), N("minecraft:standing_sign", Rc));
      N(1017, N("minecraft:sign", RX), N("minecraft:standing_sign", RX));
      N(1018, N("minecraft:sign", RY), N("minecraft:standing_sign", RY));
      N(1019, N("minecraft:sign", RQ), N("minecraft:standing_sign", RQ));
      N(1020, N("minecraft:sign", RO), N("minecraft:standing_sign", RO));
      N(1021, N("minecraft:sign", Rg), N("minecraft:standing_sign", Rg));
      N(1022, N("minecraft:sign", RI), N("minecraft:standing_sign", RI));
      N(1023, N("minecraft:sign", RJ), N("minecraft:standing_sign", RJ));
   }
}

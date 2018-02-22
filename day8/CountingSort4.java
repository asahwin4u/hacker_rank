package com.capgemini.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class CountingSort4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> m = new ArrayList<String>();
		String temp = "";
		int n2 = n / 2;
		for (int a0 = 0; a0 < n; a0++) {
			if (a0 < n2) {
				temp = in.nextInt() + " -";
				m.add(temp);
				in.next();
			} else {
				temp = in.nextInt() + " " + in.next();
				m.add(temp);
			}
		}
		m.stream().forEach(System.out::println);
		m.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o1.substring(0, 2).trim()) - Integer.parseInt(o2.substring(0, 2).trim());
				/*for (int i = 0; i < 2; i++) {
					if (o1.charAt(i) < o2.charAt(i)) {
						return -1; 
					} else if (o1.charAt(i) > o2.charAt(i)) {
						return 1;
					}
				}
				return 0;*/
			}
		});
		System.out.println("--------------------------------------");
		m.stream().forEach(System.out::println);
		m.stream().forEach(i -> {
			System.out.print(i.substring(i.indexOf(' ')+1) + " ");
		});
		in.close();
	}
	
	//- - - - - - - - - pq qy uz eb fo - - - - - mc yu no wf - - - - oe la dt im - - - - - - ek me mq el ud xz nn os xu - - - - - - - - ll nz - - - - - - no nn mr li - - iv qd - - - - - - - hp gf xl yl mh kp - - - - - fa dr rm nt rf gk - - - - - - wv jy oo qv we - - - - - - jh gh ej es is - - - - - - qs fr - - - - - sd wv dw cd hr qo tr zv ev - - - - - mj rl wj - bq bo qh os jn - - - - - - - vx zi yw - - - - - rj bl xg - - - - - - - - av cq py up - - - - nq zh oj pc aj md ly - - - - bq jt hc fx - - - - - - cz ya co gr xa - - - - da rv qi qy - - - - - - - - - au hj wj be co lv - - - kx sd ot - - - - - - - jp so if zf lg - - - - so og lv cx pz cg wo - - mn py nm jv oj lt - - - - - - - iy iv pz qb pj te lw - - - - - ry nt jx co am - - - - - - bz iy uj fk - - - - cw zx yv io - - - - - un zk hj rw - - - iv yw ft pf - - - kj to pq ki qi wd - - - - - - qd ou ew mx aq ai vm ux me - - - - - - wf xz yg ru ts zo hv - - - - - - - - kj ol vs os ls ho - - - - - - - my du ut - - - di qk lf ud on kd bb - - - - ee bt qa pi wu - - - - - - ei vl eu qi yp tz - - - - - - - pu zq ys xu ng tz rk hk - - - ma lz jl nv - - - - rh io on ek op qk - - - - - xj mb - - - vj zh rt dq er - - sf wi mh oo - - - ul - fe qs ac kw yf go ps hi tw - - - - - - kn mg jj im di rl rs - - - - - - - - - nn ky lj ep sf kv - - vo xd uz - - - bd vh gw xp qf wx - - - - - - - - dv yy oq re bd iy bw - - - - ny ww fz yc - - - - - - - - - ku lh ts - - - - - - - - uy xm hl cs pl - - - - - hc ud va hu vn - - - - ku fm cc gc kb ed ne tl - - - - - - ev bk br en vo vn pz wc - - wb od dn ib xu pk fn - - - - bl sc jx - - - - ho sh gs - - - uc kl bd - - - - ft ci rk zh - - - sh fc sj - - - - - - - - - bv dx ty ur wq up ie hm ta qi eu - - - - - iz cc ja lx de gy cr zp ll - - - - bm hs or bu - - - zd mp ig ey wx - - - - - zo cp fu ul - - - - - - - - - - gj ad za rt - - - - - - uo mf gv xl hc yj pi - - - - - - - - ww ze zr zd ug jg - - - - - - cg yh pi - - - em gd bd jn ug tc ls - - - - - - - uw ht bq - - - do ls - - - ot cx vr dk - - - - - - - bx rv zg py is hf fv - - - - ov gz vf - - - vk gu wk fj - - - - bx ee kc - - - - - ad me sp rn - - - - - - - hq kh gm vy it jy - - - - kw ng - - - - - ht jt ye gu hz vn - - - - - - - - - vd py go - - - - gc hb cv ia hz fb hd ql - - - - op vu un - - qo yk hh jp ds rg zl dz - - - - - - - - df vp xo sg yk hc bw wn dx la - - - - ms dd ut yb kl sd hq zh ga cj - - - - lx zk zh wr hf - - - - im by - - - - - jk uu fj aq bz - - nh wt - - - fe pv kk wf bk - - - - - sj xo - - - - - - jn cx nr xx
	//- - - - - - - - - pq qy uz eb fo - - - - - mc yu no wf - - - - oe la dt im - - - - - - ek me mq el ud xz nn os xu - - - - - - - - ll nz - - - - - - no nn mr li - - iv qd - - - - - - - hp gf xl yl mh kp - - - - - fa dr rm nt rf gk - - - - - - wv jy oo qv we - - - - - - jh gh ej es is - - - - - - qs fr - - - - - sd wv dw cd hr qo tr zv ev - - - - - mj rl wj - bq bo qh os jn - - - - - - - vx zi yw - - - - - rj bl xg - - - - - - - - av cq py up - - - - nq zh oj pc aj md ly - - - - bq jt hc fx - - - - - - cz ya co gr xa - - - - da rv qi qy - - - - - - - - - au hj wj be co lv - - - kx sd ot - - - - - - - jp so if zf lg - - - - so og lv cx pz cg wo - - mn py nm jv oj lt - - - - - - - iy iv pz qb pj te lw - - - - - ry nt jx co am - - - - - - bz iy uj fk - - - - cw zx yv io - - - - - un zk hj rw - - - iv yw ft pf - - - kj to pq ki qi wd - - - - - - qd ou ew mx aq ai vm ux me - - - - - - wf xz yg ru ts zo hv - - - - - - - - kj ol vs os ls ho - - - - - - - my du ut - - - di qk lf ud on kd bb - - - - ee bt qa pi wu - - - - - - ei vl eu qi yp tz - - - - - - - pu zq ys xu ng tz rk hk - - - ma lz jl nv - - - - rh io on ek op qk - - - - - xj mb - - - vj zh rt dq er - - sf wi mh oo - - - ul - fe qs ac kw yf go ps hi tw - - - - - - kn mg jj im di rl rs - - - - - - - - - nn ky lj ep sf kv - - vo xd uz - - - bd vh gw xp qf wx - - - - - - - - dv yy oq re bd iy bw - - - - ny ww fz yc - - - - - - - - - ku lh ts - - - - - - - - uy xm hl cs pl - - - - - hc ud va hu vn - - - - ku fm cc gc kb ed ne tl - - - - - - ev bk br en vo vn pz wc - - wb od dn ib xu pk fn - - - - bl sc jx - - - - ho sh gs - - - uc kl bd - - - - ft ci rk zh - - - sh fc sj - - - - - - - - - bv dx ty ur wq up ie hm ta qi eu - - - - - iz cc ja lx de gy cr zp ll - - - - bm hs or bu - - - zd mp ig ey wx - - - - - zo cp fu ul - - - - - - - - - - gj ad za rt - - - - - - uo mf gv xl hc yj pi - - - - - - - - ww ze zr zd ug jg - - - - - - cg yh pi - - - em gd bd jn ug tc ls - - - - - - - uw ht bq - - - do ls - - - ot cx vr dk - - - - - - - bx rv zg py is hf fv - - - - ov gz vf - - - vk gu wk fj - - - - bx ee kc - - - - - ad me sp rn - - - - - - - hq kh gm vy it jy - - - - kw ng - - - - - ht jt ye gu hz vn - - - - - - - - - vd py go - - - - gc hb cv ia hz fb hd ql - - - - op vu un - - qo yk hh jp ds rg zl dz - - - - - - - - df vp xo sg yk hc bw wn dx la - - - - ms dd ut yb kl sd hq zh ga cj - - - - lx zk zh wr hf - - - - im by - - - - - jk uu fj aq bz - - nh wt - - - fe pv kk wf bk - - - - - sj xo - - - - - - jn cx nr xx
	//- - - - - - - - - pq qy uz eb fo - - - - - mc yu no wf - - - - - sd wv dw cd hr qo tr zv ev - - - kx sd ot - - - - - - qd ou ew mx aq ai vm ux me - - - vj zh rt dq er - - - - - - - - uy xm hl cs pl - - - - - iz cc ja lx de gy cr zp ll - - - ot cx vr dk - - - - op vu un - - - - oe la dt im - - - - - - ek me mq el ud xz nn os xu - - - - - - - - ll nz - - - - - - no nn mr li - - iv qd - - - - - - - hp gf xl yl mh kp - - - - - fa dr rm nt rf gk - - - - - - wv jy oo qv we - - - - - - jh gh ej es is - - - - - - qs fr - - - - - mj rl wj - bq bo qh os jn - - - - - - - vx zi yw - - - - - rj bl xg - - - - - - - - av cq py up - - - - nq zh oj pc aj md ly - - - - bq jt hc fx - - - - - - cz ya co gr xa - - - - da rv qi qy - - - - - - - - - au hj wj be co lv - - - - - - - jp so if zf lg - - - - so og lv cx pz cg wo - - mn py nm jv oj lt - - - - - - - iy iv pz qb pj te lw - - - - - ry nt jx co am - - - - - - bz iy uj fk - - - - cw zx yv io - - - - - un zk hj rw - - - iv yw ft pf - - - kj to pq ki qi wd - - - - - - wf xz yg ru ts zo hv - - - - - - - - kj ol vs os ls ho - - - - - - - my du ut - - - di qk lf ud on kd bb - - - - ee bt qa pi wu - - - - - - ei vl eu qi yp tz - - - - - - - pu zq ys xu ng tz rk hk - - - ma lz jl nv - - - - rh io on ek op qk - - - - - xj mb - - sf wi mh oo - - - ul - fe qs ac kw yf go ps hi tw - - - - - - kn mg jj im di rl rs - - - - - - - - - nn ky lj ep sf kv - - vo xd uz - - - bd vh gw xp qf wx - - - - - - - - dv yy oq re bd iy bw - - - - ny ww fz yc - - - - - - - - - ku lh ts - - - - - hc ud va hu vn - - - - ku fm cc gc kb ed ne tl - - - - - - ev bk br en vo vn pz wc - - wb od dn ib xu pk fn - - - - bl sc jx - - - - ho sh gs - - - uc kl bd - - - - ft ci rk zh - - - sh fc sj - - - - - - - - - bv dx ty ur wq up ie hm ta qi eu - - - - bm hs or bu - - - zd mp ig ey wx - - - - - zo cp fu ul - - - - - - - - - - gj ad za rt - - - - - - uo mf gv xl hc yj pi - - - - - - - - ww ze zr zd ug jg - - - - - - cg yh pi - - - em gd bd jn ug tc ls - - - - - - - uw ht bq - - - do ls - - - - - - - bx rv zg py is hf fv - - - - ov gz vf - - - vk gu wk fj - - - - bx ee kc - - - - - ad me sp rn - - - - - - - hq kh gm vy it jy - - - - kw ng - - - - - ht jt ye gu hz vn - - - - - - - - - vd py go - - - - gc hb cv ia hz fb hd ql - - qo yk hh jp ds rg zl dz - - - - - - - - df vp xo sg yk hc bw wn dx la - - - - ms dd ut yb kl sd hq zh ga cj - - - - lx zk zh wr hf - - - - im by - - - - - jk uu fj aq bz - - nh wt - - - fe pv kk wf bk - - - - - sj xo - - - - - - jn cx nr xx
	//- - - - - - - - - pq qy uz eb fo - - - - - mc yu no wf - - - - - sd wv dw cd hr qo tr zv ev - - - kx sd ot - - - - - - qd ou ew mx aq ai vm ux me - - - vj zh rt dq er - - - - - - - - uy xm hl cs pl - - - - - iz cc ja lx de gy cr zp ll - - - ot cx vr dk - - - - op vu un - - - - oe la dt im - - - - - - ek me mq el ud xz nn os xu - - - - - - - - ll nz - - - - - - no nn mr li - - iv qd - - - - - - - hp gf xl yl mh kp - - - - - fa dr rm nt rf gk - - - - - - wv jy oo qv we - - - - - - jh gh ej es is - - - - - - qs fr - - - - - mj rl wj - bq bo qh os jn - - - - - - - vx zi yw - - - - - rj bl xg - - - - - - - - av cq py up - - - - nq zh oj pc aj md ly - - - - bq jt hc fx - - - - - - cz ya co gr xa - - - - da rv qi qy - - - - - - - - - au hj wj be co lv - - - - - - - jp so if zf lg - - - - so og lv cx pz cg wo - - mn py nm jv oj lt - - - - - - - iy iv pz qb pj te lw - - - - - ry nt jx co am - - - - - - bz iy uj fk - - - - cw zx yv io - - - - - un zk hj rw - - - iv yw ft pf - - - kj to pq ki qi wd - - - - - - wf xz yg ru ts zo hv - - - - - - - - kj ol vs os ls ho - - - - - - - my du ut - - - di qk lf ud on kd bb - - - - ee bt qa pi wu - - - - - - ei vl eu qi yp tz - - - - - - - pu zq ys xu ng tz rk hk - - - ma lz jl nv - - - - rh io on ek op qk - - - - - xj mb - - sf wi mh oo - - - ul - fe qs ac kw yf go ps hi tw - - - - - - kn mg jj im di rl rs - - - - - - - - - nn ky lj ep sf kv - - vo xd uz - - - bd vh gw xp qf wx - - - - - - - - dv yy oq re bd iy bw - - - - ny ww fz yc - - - - - - - - - ku lh ts - - - - - hc ud va hu vn - - - - ku fm cc gc kb ed ne tl - - - - - - ev bk br en vo vn pz wc - - wb od dn ib xu pk fn - - - - bl sc jx - - - - ho sh gs - - - uc kl bd - - - - ft ci rk zh - - - sh fc sj - - - - - - - - - bv dx ty ur wq up ie hm ta qi eu - - - - bm hs or bu - - - zd mp ig ey wx - - - - - zo cp fu ul - - - - - - - - - - gj ad za rt - - - - - - uo mf gv xl hc yj pi - - - - - - - - ww ze zr zd ug jg - - - - - - cg yh pi - - - em gd bd jn ug tc ls - - - - - - - uw ht bq - - - do ls - - - - - - - bx rv zg py is hf fv - - - - ov gz vf - - - vk gu wk fj - - - - bx ee kc - - - - - ad me sp rn - - - - - - - hq kh gm vy it jy - - - - kw ng - - - - - ht jt ye gu hz vn - - - - - - - - - vd py go - - - - gc hb cv ia hz fb hd ql - - qo yk hh jp ds rg zl dz - - - - - - - - df vp xo sg yk hc bw wn dx la - - - - ms dd ut yb kl sd hq zh ga cj - - - - lx zk zh wr hf - - - - im by - - - - - jk uu fj aq bz - - nh wt - - - fe pv kk wf bk - - - - - sj xo - - - - - - jn cx nr xx 
}

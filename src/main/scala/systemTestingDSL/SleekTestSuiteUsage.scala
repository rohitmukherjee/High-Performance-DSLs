package systemTestingDSL

import systemTestingDSL.matchers._

object SleekTestSuiteUsage {

  def main(args: Array[String]): Unit = {

    val suite = new SleekTestSuite()

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek.slk", " ", "results", "sleek.out", "Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/cll-d.slk", " ", "results", "cll_d.out", "Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/label-basic.slk", " --dis-eps", "results", "label_basic.out", "Fail, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/label-dll.slk", " --dis-eps", "results", "label_dll.out", "Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek1.slk", " ", "results", "sleek1.out", "Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek10.slk", " ", "results", "sleek10.out", "Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek2.slk", " ", "results", "sleek2.out", "Fail, Valid, Fail, Fail, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek3.slk", " --elp", "results", "sleek3.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek4.slk", " ", "results", "sleek4.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek6.slk", " ", "results", "sleek6.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek7.slk", "  --dis-lem-gen ", "results", "sleek7.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek8.slk", "  --dis-lem-gen ", "results", "sleek8.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek8.slk", "  --elp ", "results", "sleek8.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek9.slk", "  --elp ", "results", "sleek9.out", "Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek12-lend.slk", " ", "results", "sleek12_lend.out", "Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/sleek13-lend.slk", " ", "results", "sleek13_lend.out", "Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lst-under1.slk", " --inv-test", "results", "lst_under1.out", "Valid, Fail,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lst-under2.slk", " --inv-test", "results", "lst_under2.out", "Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ll-under1a.slk", "  --inv-test --baga-xpure ", "results", "ll_under1a.out", "Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ll-under1b.slk", "  --inv-test --baga-xpure ", "results", "ll_under1b.out", "Fail, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ll-under1c.slk", "  --inv-test --baga-xpure ", "results", "ll_under1c.out", "Valid, Fail,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ll-under1d.slk", "  --inv-test --baga-xpure ", "results", "ll_under1d.out", "Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ll-under1e.slk", "  --inv-test --baga-xpure ", "results", "ll_under1e.out", "Fail, Fail,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ll-under1f.slk", "  --inv-test --baga-xpure ", "results", "ll_under1f.out", "Valid, Fail,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/baga-test-eps.slk", " --eps", "results", "baga_test_eps.out", "Fail, Fail, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/baga-test.slk", " ", "results", "baga_test.out", "Fail, Fail, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/baga-test-2.slk", " --dis-baga-xpure --dis-eps", "results", "baga_test_2.out", "Fail, Fail, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Fail, Fail, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/baga-test-2.slk", " --baga-xpure", "results", "baga_test_2.out", "Fail, Fail, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/symb-diff.slk", " ", "results", "symb_diff.out", "Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/xpure3nodes.slk", "", "results", "xpure3nodes.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/app-inv.slk", " --inv --dis-eps", "results", "infer_app_inv.out", "Valid, Valid, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/app-inv2.slk", " --inv --dis-eps", "results", "infer_app_inv2.out", "Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer1.slk", " ", "results", "infer_infer1.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer2.slk", " ", "results", "infer_infer2.out", "Valid, Valid, Valid, Fail, Valid, Fail, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer4.slk", " ", "results", "infer_infer4.out", "Fail, Fail, Val")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer5.slk", " ", "results", "infer_infer5.out", "Valid, Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer5a.slk", " ", "results", "infer_infer5a.out", "Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer6.slk", " ", "results", "infer_infer6.out", "Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer7.slk", " ", "results", "infer_infer7.out", "Valid, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer8.slk", " ", "results", "infer_infer8.out", "Valid, Valid, Valid, Fail, Fail, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer9.slk", " ", "results", "infer_infer9.out", "Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer10.slk", " ", "results", "infer_infer10.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail, Fail, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer11.slk", " ", "results", "infer_infer11.out", "Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer12.slk", " ", "results", "infer_infer12.out", "Valid, Fail, Fail, Fail, Fail, Valid, Fail, Fail, Fail, Fail, Fail, Valid, Fail, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer12.slk", " ", "results", "infer_infer12.out", "Valid, Fail, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Fail, Fail, Valid, Fail, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer13.slk", " --sa-en-cont", "results", "infer_infer13.out", "Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer14.slk", " --sa-en-pure-field", "results", "infer_infer14.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer15.slk", " ", "results", "infer_infer15.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infer/infer16.slk", " ", "results", "infer_infer16.out", "Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/ann2.slk", "  --imm --en-imm-inv --etcsu1 ", "results", "ann2.out", "Valid, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Fail, Fail, Valid, Fail, Valid, Fail, Fail, Valid, Valid, Valid, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm/imm1.slk", "  --imm --etcsu1 ", "results", "imm_imm1.out", "Fail, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm/imm2.slk", "  --imm --etcsu1 ", "results", "imm_imm2.out", "Fail, Valid, Fail, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm/imm3.slk", "  --imm --etcsu1 ", "results", "imm_imm3.out", "Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm/imm4.slk", "  --imm --etcsu1 ", "results", "imm_imm4.out", "Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm/imm-hard.slk", "  --imm --eps", "results", "imm_imm_hard.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm-field/sleek01.slk", "  --field-ann --etcsu1 ", "results", "imm_field_sleek01.out", "Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm-field/sleek02.slk", "  --field-ann --etcsu1 ", "results", "imm_field_sleek02.out", "Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm-field/sleek03.slk", "  --field-ann --etcsu1 ", "results", "imm_field_sleek03.out", "Valid, Fail, Valid, Valid, Fail, Valid, Valid, Fail, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/eps.slk", "  --dis-imm ", "results", "eps.out", "Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/imm-field/sleek05.slk", "  --field-ann --etcsu1 ", "results", "imm_field_sleek05.out", "Valid, Fail, Fail, Fail, Fail, Fail, Valid, Valid, Val")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic1.slk", " ", "results", "classic_classic1.out", "Valid, Valid, Valid, Valid, Valid, Valid, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic1.slk", "  --classic", "results", "classic_classic1.out", "Fail, Valid, Valid, Valid, Fail, Valid, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic1a.slk", " ", "results", "classic_classic1a.out", "Fail, Valid, Fail, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic1b.slk", " ", "results", "classic_classic1b.out", "Valid, Valid, Valid, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Fail, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic2.slk", " ", "results", "classic_classic2.out", "Fail, Valid, Valid, Valid, Fail, Valid, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic3.slk", " ", "results", "classic_classic3.out", "Valid, Valid, Valid, Valid, Valid, Valid, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/classic/classic4.slk", " ", "results", "classic_classic4.out", "Valid, Fail, Valid, Fail, Valid, Fail, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/inf-no-eps.slk", "--dsd --en-inf --dis-eps", "results", "inf_no_eps.out", "Fail, Fail, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/infinity.slk", "--dsd --en-inf --dis-eps", "results", "infinity.out", "Fail, Valid, Valid, Fail, Valid, Valid, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Fail, Valid, Fail, Fail, Valid, Valid, Fail, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Valid, Fail, Valid, Valid, Valid, Fail, Fail, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/inflem.slk", "  --en-inf --elp --dis-eps", "results", "inflem.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/sort2.slk", "  --elp --dis-lem-gen ", "results", "lemmas_sort2.out", "Fail, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/lseg.slk", "  --elp --dis-lem-gen ", "results", "lemmas_lseg.out", "Valid, Valid, Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/lseg1.slk", "  --elp --dis-lem-gen ", "results", "lemmas_lseg1.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/rlseg.slk", "  --elp --dis-lem-gen", "results", "lemmas_rlseg.out", "Valid, Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/lemma-fold.slk", "  --elp ", "results", "lemmas_lemma_fold.out", "Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/rd-lem-1.slk", "  --elp --dis-lem-gen ", "results", "lemmas_rd_lem_1.out", "Fail, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/rd-lem-2.slk", " ", "results", "lemmas_rd_lem_2.out", "Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/app-tail.slk", "  --elp ", "results", "lemmas_app_tail.out", "Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/lseg_case.slk", "  --elp --dis-lem-gen ", "results", "lemmas_lseg_case.out", "Valid, Valid, Valid, Valid, Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/ll.slk", "  --elp ", "results", "lemmas_ll.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/ll_tail.slk", "  --elp ", "results", "lemmas_ll_tail.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/nlseg3.slk", " ", "results", "lemmas_nlseg3.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/nlseg4e.slk", "  --elp ", "results", "lemmas_nlseg4e.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/nlseg4e1.slk", " --dis-imm", "results", "lemmas_nlseg4e1.out", "Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/sll_tailL.slk", "  --elp ", "results", "lemmas_sll_tailL.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/dseg-new.slk", "  --elp --dis-lem-gen ", "results", "lemmas_dseg_new.out", "Valid, Fail, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/dseg1.slk", "  --elp --dis-lem-gen ", "results", "lemmas_dseg1.out", "Valid, Fail,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/odd-lseg.slk", "  --elp --dis-lem-gen --dis-eps", "results", "lemmas_odd_lseg.out", "Valid, Valid,")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/lemmas/lseg_complex.slk", "  --elp --dis-lem-gen ", "results", "lemmas_lseg_complex.out", "Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/split_simple.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_split_simple.out", "Valid, Fail, Valid, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/split-combine.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_split_combine.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/vperm/vperm.slk", " --ann-vp", "results", "vperm_vperm.out", "Valid, Valid, Fail, Valid, Valid, Fail, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/bperm-split-combine.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_bperm_split_combine.out", "Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-static.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_static.out", "Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-dynamic2.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_dynamic2.out", "Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/threads/thrd1.slk", " --en-para --en-thrd-resource -tp redlog", "results", "threads_thrd1.out", "Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail, Valid, Fail, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Val")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/conchip/threads.slk", " -tp parahip", "results", "conchip_threads.out", "Valid, Valid, Val")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/conchip/latch.slk", " -tp parahip", "results", "conchip_latch.out", "Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fa")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/../tree_shares/barrier.slk", " --eps --dis-field-ann --dis-precise-xpure -perm dperm", "results", ".._tree_shares_barrier.out", "")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/../tree_shares/barrier3.slk", " --eps --dis-field-ann --dis-precise-xpure -perm dperm", "results", ".._tree_shares_barrier3.out", "")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/../tree_shares/barrier2.slk", " --eps --dis-field-ann -perm dperm", "results", ".._tree_shares_barrier2.out", "Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/../tree_shares/fractions.slk", " --eps --dis-field-ann -perm dperm", "results", ".._tree_shares_fractions.out", "Valid, Fail, Valid, Fail, Fail, Fail, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail, Valid, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/threads/thrd1.slk", " --en-para --en-thrd-resource -tp redlog", "results", "threads_thrd1.out", "Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Fail, Valid, Fail, Fail, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Val")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/vperm/vperm.slk", " --ann-vp", "results", "vperm_vperm.out", "Valid, Valid, Fail, Valid, Valid, Fail, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/vperm/vperm2.slk", " --ann-vp", "results", "vperm_vperm2.out", "Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek.out", "Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek1.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek1.out", "Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek10.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek10.out", "Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek2.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek2.out", "Fail, Valid, Fail, Fail, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek3.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek3.out", "Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek4.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek4.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek6.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek6.out", "Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek7.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek7.out", "Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek8.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek8.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Fail, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/sleek9.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_sleek9.out", "Valid, Fail, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/norm1.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_norm1.out", "Fail, Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/norm3.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_norm3.out", "Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/norm4.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_norm4.out", "Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/uni_vars.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_uni_vars.out", "Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/frac1.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_frac1.out", "Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/frac2.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_frac2.out", "Valid, Fail, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Fail, Valid, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/frac3.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_frac3.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Fail, Fail, Fail, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/split_simple.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_split_simple.out", "Valid, Fail, Valid, Fail, Fail, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/combine_data.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_combine_data.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/combine_simple.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_combine_simple.out", "Valid, Valid, Fail, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/split-combine.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_split_combine.out", "Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/fracperm/combine2.slk", "--en-para -perm fperm -tp redlog", "results", "fracperm_combine2.out", "Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/bperm1.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_bperm1.out", "Valid, Fail, Valid, Valid, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/bperm-split.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_bperm_split.out", "Valid, Valid, Fail, Valid, Valid, Fail, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/bperm-combine.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_bperm_combine.out", "Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/bperm-split-combine.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_bperm_split_combine.out", "Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier1.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier1.out", "Valid, Fail, Valid, Valid, Valid, Valid, Valid, Fail")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-split.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_split.out", "Valid, Valid, Fail, Valid, Valid, Fail, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-combine.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_combine.out", "Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-sep.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_sep.out", "Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-static.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_static.out", "Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-dynamic.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_dynamic.out", "Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid")

    suite addTest ("sleek", "/home/rohit/hg/sleek_hip/examples/working/sleek/veribsync/barrier-dynamic2.slk", "--en-para -perm bperm -tp redlog", "results", "veribsync_barrier_dynamic2.out", "Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid, Fail, Valid, Valid, Fail, Valid, Valid, Valid, Fail, Fail, Valid, Valid, Valid, Fail, Valid, Valid, Valid, Valid, Valid, Valid")

    suite.runAllTests

    suite generateTestStatistics

    val cll_dTest =
      new RegressionTestCaseBuilder runCommand "sleek" onFile "/home/rohit/hg/sleek_hip/examples/working/sleek/cll-d.slk" withArguments " " storeOutputInDirectory "results" withOutputFileName "cll_d.out"
    println(cll_dTest.build generateTestResults ())
  }
}

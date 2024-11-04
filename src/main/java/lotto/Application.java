package lotto;

import lotto.controller.LottoController;
import lotto.model.Lottos;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        LottoController lottoController = new LottoController();

        int purchaseCount = lottoController.getLottoPurchaseCount(inputView.getLottoCost());

        Lottos lottos = lottoController.generateLottos(purchaseCount);
        outputView.showMyLottos(lottos, purchaseCount);

        inputView.getWinningLotto();
        
        inputView.getBonusNumber();
    }
}

package lotto.domain;

import java.util.List;

public class WinningNumber{

    private Lotto winningNumber;
    private int bonusNumber;

    public WinningNumber(Lotto winningNumber, int bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }
}

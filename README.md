# BankTransactionReader

The application reads an input CSV file with bank transactions and computes total 
income and expenses for the whole file, presenting a small balance report at the end.

The expected CVS format is:

    Date,Details,Transaction Type,In,Out,Balance
    20 January 2022,WAITROSE 178 AppPay,LONDON  GBR,,13.00,944.81
    19 January 2022,Boots AppPay,London GBR GBR,,10.00,957.81


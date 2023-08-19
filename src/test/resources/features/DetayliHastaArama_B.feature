Scenario: TC002 0???  If something except Kendisi is selected, then Kart Sahibi box should be active (Kimliksiz Hasta)
When Select Kimliksiz Hasta from   Hasta Türü drop down menu on Hasta Kayıt Page
And Select Proximity from Yakınlığı drop down menu on Hasta Kayıt Page
Then Kart Sahibi box should be active on Hasta Kayıt Page when If something except Kendisi is selected

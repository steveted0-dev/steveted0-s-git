# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'designerzIlMeh.ui'
##
## Created by: Qt User Interface Compiler version 5.14.1
##
## WARNING! All changes made in this file will be lost when recompiling UI file!
################################################################################
import PyQt5

class Ui_lang(object):
    def setupUi(self, lang):
        if lang.objectName():
            lang.setObjectName(u"lang")
        lang.resize(400, 300)
        self.label = QLabel(lang)
        self.label.setObjectName(u"label")
        self.label.setGeometry(QRect(30, 10, 261, 16))
        self.pushButton = QPushButton(lang)
        self.pushButton.setObjectName(u"pushButton")
        self.pushButton.setGeometry(QRect(10, 40, 381, 111))
        self.pushButton_2 = QPushButton(lang)
        self.pushButton_2.setObjectName(u"pushButton_2")
        self.pushButton_2.setGeometry(QRect(10, 160, 381, 131))

        self.retranslateUi(lang)

        QMetaObject.connectSlotsByName(lang)
    # setupUi

    def retranslateUi(self, lang):
        lang.setWindowTitle(QCoreApplication.translate("lang", u"Dialog", None))
        self.label.setText(QCoreApplication.translate("lang", u"\uc5b8\uc5b4\uc120\ud0dd(Select a language)", None))
        self.pushButton.setText(QCoreApplication.translate("lang", u"\ud55c\uad6d\uc5b4", None))
        self.pushButton_2.setText(QCoreApplication.translate("lang", u"English", None))
    # retranslateUi

